package myproject.device;

abstract class Device {
    String model;
    String producer;
    Double value;

    public Device(String model, String producer, Double value) {
    model = model;
    producer = producer;
    value = value;
    }
    public String toString(){
        return "Model: " + this.model+"Producent: "+this.producer;
    }
    public abstract void turnOn();

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
