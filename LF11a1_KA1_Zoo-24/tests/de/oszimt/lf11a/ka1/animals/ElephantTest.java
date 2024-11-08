package de.oszimt.lf11a.ka1.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ElephantTest {

    @org.junit.jupiter.api.Test
    void hello() {
        Elephant e = new Elephant("elephantelephant");

        assertTrue(e.hello().toLowerCase().startsWith("torooo"),"Begrüßungstext enthält nicht Torooo, sondern: "+e.hello());
        assertTrue(e.hello().toLowerCase().contains("elephantelephant"),"Begrüßungstext enthält nicht den Namen, sondern: "+e.hello());
        assertTrue(e.hello().contains("4"),"Begrüßungstext enthält die Anzahl der Beine, sondern: "+e.hello());
    }

    @Test
    void extendsMammel() {
        Class<Elephant> clazz = Elephant.class;

        assertEquals(Mammal.class, clazz.getSuperclass(), "Klasse Elephant erbt nicht von Mammal");
    }
}