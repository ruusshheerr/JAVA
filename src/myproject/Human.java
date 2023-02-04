package myproject;

import myproject.device.Car;

import java.util.Arrays;
import java.util.Date;

public class Human implements Salleable {
    private static final Double DEFAULT_SALARY = 10000.0;
    private static final int DEFAULT_GARAGE_SIZE = 2;
    private String firstName;
    private String lastName;
    private Integer Age;
    private String Pet;
    private String owner;

    public Car[] garage;

    private Double Salary;


    private Boolean IS_HUMAN = true;
    public Human(String firstName, String lastName, Integer age, String pet, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = age;
        this.Pet = pet;
        this.Salary = DEFAULT_SALARY;
        this.garage = new Car[garageSize];
    }

    public Human(String firstName, String lastName, Integer age, String pet){
        this(firstName, lastName, age, pet, DEFAULT_GARAGE_SIZE);
    }
    public Car getCar(int parkingSpot) {
        return garage[parkingSpot];
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double cash = 20000.0;

    public void setCar(Car car, int parkingSpot) {
        garage[parkingSpot] = car;
    }
    public void buyCar(Car car, double value) {
        if (this.cash >= value) {
            this.cash -= value;
            for(int i=0;i<garage.length;i++){
                if(garage[i]==null){
                    garage[i]=car;
                    break;
                }
            }
            System.out.println("Kupiłeś samochód za gotówkę");

        } else if (this.Salary >= (value / 12.0)) {
            System.out.println("Kupiłeś samochód na kredyt");
            for(int i=0;i<garage.length;i++){
                if(garage[i]==null){
                    garage[i]=car;
                    break;
                }
            }
        } else {
            System.out.println("wez sobie znajdź pracę lepiej");
        }
    }

    public void setSalary(Double Salary){
        if(Salary >=0){
            this.Salary = Salary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Uwaga! Konieczność odebrania aneksu do umowy od pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
        else{
            System.out.println("Błąd, wypłata nie może być ujemna.");
        }
    }
    public Double getSalary(){
        Date Data = new Date();
        System.out.println("Ostatnie pobranie informacji o wypłacie odbyło się "+ Data.toString()+" i wynosiła "+this.Salary);
        return this.Salary;
    }
    public Double startingCash(){
        return this.Salary;
    }
    public String showHuman(){
        return "First name:"+firstName+", Last Name: "+lastName+", Age:"+Age+", String:"+Pet;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(IS_HUMAN = true ){
            System.out.println("Nie handluj ludźmi!");
            return;
        }
    }
    public Double getGarageValue(){
        double value = 0.0;
        for(Car car : garage){
            if(car != null){
                value += car.getValue();
            }
        }
        return value;
    }

    public void sortCar(){
        Arrays.sort(garage, (car1, car2) -> car1.getYearOfProduction() - car2.getYearOfProduction());

    }
}
