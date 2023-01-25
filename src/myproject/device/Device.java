package myproject.device;

abstract class Device {
    final String model;
    final String producer;

    public Device(String model, String producer) {
    model = model;
    producer = producer;
    }
    public String toString(){
        return "Model: " + this.model+"Producent: "+this.producer;
    }
    public abstract void turnOn();
}
