package myproject.creatures;

import myproject.Human;

public class FarmAnimal extends Animal implements Edbile{
    public FarmAnimal(String species, Human owner) {
        super(species, owner);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
