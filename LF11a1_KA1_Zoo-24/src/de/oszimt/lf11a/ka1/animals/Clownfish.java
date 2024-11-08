package de.oszimt.lf11a.ka1.animals;

public class Clownfish extends Animal {

    public Clownfish(String name) {
        super(name, "Clownfish");
    }

    @Override
    public String hello() {
        return "Blub Blub, mein Name ist " + super.getName();
    }
}
