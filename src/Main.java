public class Main {
    public static void main(String[] args) {

//-----------------Zadanie I---------------------------

    Animal Dog = new Animal("canis");

    Dog.name = "Reksio";
    System.out.println("\nZadanie I\n");

    Dog.feedAnimal();
    Dog.takeForAWalk();
    Dog.takeForAWalk();
    Dog.takeForAWalk();
    Dog.takeForAWalk();
    Dog.takeForAWalk();
    Dog.feedAnimal();

    //-----------------Zadanie II--------------------------

    Human Man1 = new Human("Jan","Kowalski",30,"Reksio");
    Car myCar = new Car("x6","BMW", 100000.0,2022);
    Man1.setCar(myCar);
    }
}