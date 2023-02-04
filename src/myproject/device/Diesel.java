package myproject.device;

import myproject.Human;

public class Diesel extends Car{
    public Diesel(String model, String producer, Double value, Integer yearOfProduction) {
        super(model, producer, value, yearOfProduction);
    }

    @Override
    public void refuel() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
