package de.oszimt.lf11a.ka1.animals;

public abstract class Mammal extends Animal {
    protected int legs;

    public Mammal(String name, String species, int legs) {
        super(name, species);
        this.legs = legs;
    }

    @Override
    public String hello() {
        return ", mein Name ist " + super.getName() + " und ich bin ein " + super.getSpecies() + " und habe " + legs + " Beine.\n";
    }
}
