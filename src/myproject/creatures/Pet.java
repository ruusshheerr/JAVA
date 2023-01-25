package myproject.creatures;

import myproject.Human;

public class Pet extends Animal{
    public Pet(String species, Human owner) {
        super(species, owner);
    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
