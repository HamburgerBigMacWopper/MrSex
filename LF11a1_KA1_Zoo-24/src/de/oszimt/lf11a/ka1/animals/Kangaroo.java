package de.oszimt.lf11a.ka1.animals;

public class Kangaroo extends Mammal {
    public Kangaroo(String name) {
        super(name, "Kangaroo", 2);
    }

    @Override
    public String hello() {
        return "Eier?, mein Name ist Das " + super.getName() + " und ich bin ein Kangaroo und habe 2 Beine.";
    }
}
