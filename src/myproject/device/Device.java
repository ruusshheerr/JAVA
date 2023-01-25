package myproject.device;

abstract class Device {
    final String Model;
    final String Producer;

    public Device(String model, String producer) {
        Model = model;
        Producer = producer;
    }
    public String toString(){
        return "Model: " + this.Model+"Producent: "+this.Producer;
    }
    public abstract void turnOn();
}
