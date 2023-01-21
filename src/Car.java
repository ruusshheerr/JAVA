public class Car {
    final String Model;
    final String Producer;
    public Double Value;

    private Integer yearOfProduction;

    public Car(String model, String producer, Double value, Integer yearOfProduction) {
        Model = model;
        Producer = producer;
        Value = value;
        this.yearOfProduction = yearOfProduction;
    }

    public String showCar(){
        return "Producer: "+Producer+", Model: "+Model+", Value: "+Value;
    }
}
