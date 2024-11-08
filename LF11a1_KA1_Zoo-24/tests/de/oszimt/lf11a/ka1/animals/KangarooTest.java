package de.oszimt.lf11a.ka1.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {

    @Test
    void hello() {
        Kangaroo k = new Kangaroo("kangarookangaroo");

        assertTrue(k.hello().toLowerCase().startsWith("eier?"),"Begrüßungstext enthält nicht Eier, sondern: "+k.hello());
        assertTrue(k.hello().toLowerCase().contains("kangarookangaroo"),"Begrüßungstext enthält nicht den Namen, sondern: "+k.hello());
        assertTrue(k.hello().contains("2"),"Begrüßungstext enthält die Anzahl der Beine, sondern: "+k.hello());
    }

    @Test
    void extendsMammel() {
        Class<Kangaroo> clazz = Kangaroo.class;

        assertEquals(Mammal.class, clazz.getSuperclass(), "Klasse Elephant erbt nicht von Mammal");
    }
}