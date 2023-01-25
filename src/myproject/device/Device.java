package myproject.device;

abstract class Device {
    final String model;
    final String producer;

    public Device(String model, String producer, String model1, String producer1) {
        this.model = model1;
        this.producer = producer1;
        model = model;
    producer = producer;
    }
    public String toString(){
        return "Model: " + this.model+"Producent: "+this.producer;
    }
    public abstract void turnOn();
}
