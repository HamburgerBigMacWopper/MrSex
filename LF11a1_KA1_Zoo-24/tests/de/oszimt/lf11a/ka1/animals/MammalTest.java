package de.oszimt.lf11a.ka1.animals;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void constructor() {
        Class<Mammal> clazz = Mammal.class;
        try {
            clazz.getConstructor(String.class, String.class, int.class);
        } catch (NoSuchMethodException e) {
            fail("Konstruktor der Klasse Mammel entspricht nicht dem Format (String, String, Integer)");
        }
    }

    @Test
    void isAbstract() {
        Class<Mammal> clazz = Mammal.class;

        assertTrue(Modifier.isAbstract(clazz.getModifiers()), "Klasse Mammal ist nicht abstrakt");
    }

    @Test
    void extendsAnimal() {
        Class<Mammal> clazz = Mammal.class;

        assertEquals(Animal.class, clazz.getSuperclass(), "Klasse Mammal erbt nicht von Animal");
    }
}