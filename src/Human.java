import Creatures.Animal;

public class Human {
    String firstName;
    String lastName;
    private Double salary;
    Animal pet; //obiekty mogą być polami w innych klasach

    public Double getSalary() {return salary; }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
