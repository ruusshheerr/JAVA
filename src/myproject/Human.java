package myproject;

import myproject.device.Car;

import java.util.Date;

public class Human implements Salleable {
    private static final Double DEFAULT_SALARY = 10000.0;
    private Boolean IS_HUMAN = true;
    public Human(String firstName, String lastName, Integer age, String pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        Pet = pet;
        this.Salary = DEFAULT_SALARY;
    }

    private String firstName;
    private String lastName;
    private Integer Age;
    private String Pet;

    private String owner;

    private String car;

    private Double Salary;

    public String getCar() {
        return this.car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double cash = 20000.0;

    public void setCar(Car Car) {
        if(Salary > Car.Value){
            System.out.println("Udało się kupić samochód za gotówkę");
            car = Car.showCar();
        }
        else if(Salary < Car.Value/12){
            System.out.println("Udało się kupić samochód na raty");
            car = Car.showCar();
        }
        else{
            System.out.println("Nie stać Cię biedakuuu");
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
}