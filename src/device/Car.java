package device;

public class Car extends Device  {

    public Double Value;

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
}
