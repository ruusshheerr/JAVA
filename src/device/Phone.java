package device;

public class Phone {
    public Phone(String model, String producer, Double value) {
        Model = model;
        Producer = producer;
        Value = value;
    }

    final String Model;
    final String Producer;
    public Double Value;
    public String showPhone(){
        return "Producer: "+Producer+", Model: "+Model+", Value: "+Value;
    }
}
