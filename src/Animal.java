public class Animal {
    private static final Double DEFAULT_CANIS_WIGHT = 12.3;
    private static final Double DEFAULT_FELIS_WIGHT = 3.2;
    private static final Double DEFAULT_URSUS_WIGHT = 480.0;
    private static final Double DEFAULT_DOG_WIGHT = 1.0;
    String specie;
    String name;
    Boolean isAlive;
    Double weight;

    Animal(String specie){ //konstruktor, wymusza żeby istaniała rasa
        this.specie = specie;  // po this będzie element który jest częścią tej klasy. A to co wymuszamy musi bycwpisane przy wywolaniu obiektu w nawiasie
        this.isAlive = true;

        switch (specie) {
            case "canis" -> this.weight = DEFAULT_CANIS_WIGHT;
            case "felis" -> this.weight = DEFAULT_FELIS_WIGHT;
            case "ursus" -> this.weight = DEFAULT_URSUS_WIGHT;
            default -> this.weight = DEFAULT_DOG_WIGHT;
        }

    }
    void feed(){ // metoda, czyli funkcja przypisana do tej klasy
        switch (isAlive){
        case true -> this.weight += 1.0 && System.out.println("Dzięki za żarcie");
        case false ->

        }
        if (isAlive = false) {
            System.out.println("Czy wszystko dobrze z Twoją głową?");
        }
    }
    void takeForAWalk(){

        if (isAlive = true) {
            this.weight -= 1.0;
            System.out.println("Dzięki za spacer");
            if (weight <= 0.0){
                isAlive = false;
            }

        }
        else {
            System.out.println("Dzwonie na policje!");
        }
    }
}
