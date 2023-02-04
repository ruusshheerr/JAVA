package myproject.device;

import myproject.Human;
import myproject.Salleable;

public abstract class Car extends Device implements Salleable {


    public Human owner;
    private Integer yearOfProduction;

    public Car(String model, String producer, Double value, Integer yearOfProduction) {
        super(model, producer, value);
        this.yearOfProduction = yearOfProduction;
    }

    public String showCar(){
        return "Producer: "+producer+", Model: "+model+", Value: "+value;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód odpala");
    }

    public void sell(Human seller, Human buyer, double price) throws IllegalArgumentException {
        int sellerIndex=-1;
        for(int i=0;i<seller.garage.length;i++){
            if(seller.garage[i]==this){
                sellerIndex=i;
                break;
            }
        }
        if(sellerIndex==-1){
            throw new IllegalArgumentException("on nie ma tego auta :O!");
        }
        int buyerIndex=-1;
        for(int i=0;i<buyer.garage.length;i++){
            if(buyer.garage[i]==null){
                buyerIndex=i;
                break;
            }
        }
        if(buyerIndex==-1){
            throw new IllegalArgumentException("Kupujący nie ma miejsca w garażu");
        }
        if(buyer.getCash()<price){
            throw new IllegalArgumentException("Kupujący nie ma kaski");
        }
        seller.garage[sellerIndex]=null;
        buyer.garage[buyerIndex]=this;
        seller.setCash(seller.getCash()+price);
        buyer.setCash(buyer.getCash()-price);
        System.out.println("spoko autko masz tera");
    }


    abstract public void refuel();

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
