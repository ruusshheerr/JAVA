public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 5.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 4.0;

    final String species;

    public String name;
    private Double weight;

    private Boolean isAlive = true;



    public Animal(String species) {
        this.species = species;
        this.isAlive = true;
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }


        public void feedAnimal(){
            if (isAlive) {
                weight += 3.0;
                System.out.println("Mniam mniam");
            } else {
                System.out.println("Panie, on już nie żyje!");
            }

        }

        public void takeForAWalk() {
            if (isAlive) {
                weight -= 2;
                System.out.println("Idziemy na spacerek");
                if (weight <= 0) {
                    isAlive = false;
                    System.out.println("Piesek nie przepalił tempa [*] :(");
                }
            } else {
                System.out.println("Panie, on już nie żyje!");
            }

        }
    }
