package de.oszimt.lf11a.ka1.animals;

public class Elephant extends Mammal {
    public Elephant(String name) {
        super(name, "Elephant", 4);
    }

    @Override
    public String hello() {
        return "Torooo, mein Name ist " + super.getName() + " und ich bin ein Elephant und habe 4 Beine.\n";
    }
}
