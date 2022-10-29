public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog. name = "Szarik";
        dog.isAlive = true;

        System.out.println(dog.name);
        dog.feed();


        Human me = new Human();
        me.firstName = "Jędrzej";

        me.pet = dog; //obiekty mogą być polami w innych klasach
        me.pet.feed();

        me.pet = new Animal("felis");

        System.out.println(me.pet.name);
        me.pet.feed();
        dog.feed();
        dog.takeForAWalk();
    }
}