public class Car {
    final String produce;
    final String model;
    Double distance;
    String color;

    Car(String produce, String model){
        this.produce = produce;
        this.model = model;
    }
    public String toString() {
        return "Producer: " + this.produce + " Model: " + this.model;
    }
}
