package myproject.device;

import myproject.Human;
import myproject.Salleable;

public class Phone extends Device implements Salleable {
    public Phone(String model, String producer, Double value) {
        super(model, producer);
        Value = value;
    }


    public Double Value;
    public Human owner;
    public String showPhone(){
        return "Producer: "+Producer+", Model: "+Model+", Value: "+Value;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon się włącza");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller != this.owner){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        this.owner = buyer;
        System.out.println("Gratuluje zakupu!");
    }
}
