public class Car extends Device{  ///extends do dziedziczenia

    String distance;
    String color;

    public Car() {

    }

    @Override
    public void recharge(Integer percentage) {
        System.out.println("Ładuję");
        System.out.println("Ładuję");
        System.out.println("Ładuję");
        System.out.println("Naładowane!");
    }


}
