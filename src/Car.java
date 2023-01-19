public class Car {
    final String Model;
    final String Producer;

    private Double Value;

    private Integer yearOfProduction;

    public Car(String model, String producer, Double value, Integer yearOfProduction) {
        Model = model;
        Producer = producer;
        Value = value;
        this.yearOfProduction = yearOfProduction;
    }
}
