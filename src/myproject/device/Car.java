package myproject.device;

import myproject.Human;
import myproject.Salleable;

public class Car extends Device implements Salleable {

    public Double Value;
    public Human owner;
    private Integer yearOfProduction;

    public Car(String model, String producer, Double value, Integer yearOfProduction) {
        super(model, producer);
        Value = value;
        this.yearOfProduction = yearOfProduction;
    }

    public String showCar(){
        return "Producer: "+Producer+", Model: "+Model+", Value: "+Value;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód odpala");
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
