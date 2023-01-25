import myproject.creatures.Pet;
import myproject.device.Car;
import myproject.device.Diesel;
import myproject.device.Phone;
import myproject.creatures.Animal;
import myproject.Human;

public class Main {
    public static void main(String[] args) {

//-----------------Zadanie I---------------------------
    Human Man1 = new Human("Jan","Kowalski",30,"Reksio");
    Animal Dog = new Pet("canis", Man1);

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
    System.out.println("\nZadanie II\n");
    Car myCar = new Diesel("x6","BMW", 100000.0,2022);
    Man1.setCar(myCar);

    //-----------------Zadanie III+IV-------------------------
    System.out.println("\nZadanie III+IV\n");
    System.out.println("Obecna pensja wynosi "+Man1.startingCash()+".");
    Man1.setSalary(-10.0);
    Man1.setSalary(20000.0);
    Man1.getSalary();

    //-----------------Zadanie V-------------------------
    System.out.println("\nZadanie V\n");
    Man1.setCar(myCar);
    Man1.getCar();

    //-----------------Zadanie VI-------------------------
    System.out.println("\nZadanie VI\n");
    Car myCar2 = new Diesel("x6","BMW", 100000.0,2022);
    System.out.println(myCar.equals(myCar2));
    System.out.println(myCar);
    System.out.println(myCar2);

    //-----------------Zadanie VII-------------------------
    System.out.println("\nZadanie VII\n");
    myCar.turnOn();
    Phone myPhone = new Phone("promax", "Iphone", 5000.0);
    myPhone.turnOn();

    //-----------------Zadanie VIII-------------------------
    System.out.println("\nZadanie VIII\n");
    Human Man2 = new Human("Marek","Nowak",30,"Bleki");
    Dog.sell(Man1, Man2, 100.0);
    Dog.sell(Man1, Man2, 1000000.0);
    Man1.sell(Man1, Man2, 100.0);
    //-----------------Zadanie IX-------------------------
    System.out.println("\nZadanie IX\n");
    System.out.println("\nZrobione ale nie ma co wyświetlać\n");
    //-----------------Zadanie X-------------------------
    System.out.println("\nZadanie X\n");
    myPhone.installAnnApp("testowaApka", "1.0", "0.0.0.0.0.");
    System.out.println("\nSkoro działają poprzednie zadania z samochodem, to samochód działa :)\n");
    }
}