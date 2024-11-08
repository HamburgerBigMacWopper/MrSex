package de.oszimt.lf11a.ka1.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClownfishTest {

    @Test
    void extendsAnimal() {
        Class<Clownfish> clazz = Clownfish.class;

        assertEquals(Animal.class, clazz.getSuperclass(), "Klasse ClownFish erbt nicht von Animal");
    }

    @org.junit.jupiter.api.Test
    void hello() {
        Clownfish a = new Clownfish("fishyfish");

        assertTrue(a.hello().toLowerCase().startsWith("blub blub"),"Begrüßungstext enthält nicht Blub Blub, sondern: "+a.hello());
        assertTrue(a.hello().toLowerCase().contains("fishyfish"),"Begrüßungstext enthält nicht den Namen, sondern: "+a.hello());
    }
}