package device;

public class Phone extends Device {
    public Phone(String model, String producer, Double value) {
        super(model, producer);
        Value = value;
    }


    public Double Value;
    public String showPhone(){
        return "Producer: "+Producer+", Model: "+Model+", Value: "+Value;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon się włącza");
    }
}
