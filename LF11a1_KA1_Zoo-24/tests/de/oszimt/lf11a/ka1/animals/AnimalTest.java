package de.oszimt.lf11a.ka1.animals;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void constructor() {
        Class<Animal> clazz = Animal.class;
        try {
            clazz.getConstructor(String.class, String.class);
        } catch (NoSuchMethodException e) {
            fail("Konstruktor der Klasse Animal entspricht nicht dem Format (String, String)");
        }
    }

    @Test
    void isAbstract() {
        Class<Animal> clazz = Animal.class;

        assertTrue(Modifier.isAbstract(clazz.getModifiers()), "Klasse Animal ist nicht abstrakt");
    }

    @Test
    void checkGetter() {
        Class<Animal> clazz = Animal.class;
        try {
            clazz.getMethod("getName");
            clazz.getMethod("getSpecies");
        } catch (NoSuchMethodException e) {
            fail("Getter der Klasse Animal exisiteren nicht.");
        }
    }

    @Test
    void helloAbstract() {
        Class<Animal> clazz = Animal.class;
        try {
            Method m = clazz.getMethod("hello");
            assertTrue(Modifier.isAbstract(m.getModifiers()), "Methode hello der Klasse Animal ist nicht abstrakt");
        } catch (NoSuchMethodException e) {
            fail("Getter der Klasse Animal existieren nicht.");
        }
    }

    @Test
    void attributeName() {
        Class<Animal> clazz = Animal.class;
        try {
            Field n = clazz.getDeclaredField("name");

            assertEquals(String.class, n.getType(), "Attribut name der Klasse Animal ist nicht vom Typ String");
            assertTrue(Modifier.isProtected(n.getModifiers()), "Attribut name der Klasse Animal ist nicht protected");
        } catch (NoSuchFieldException e) {
            fail("Attribute der Klasse Animal existieren nicht.");
        }
    }

    @Test
    void attributeSpecies() {
        Class<Animal> clazz = Animal.class;
        try {
            Field s = clazz.getDeclaredField("species");

            assertEquals(String.class, s.getType(), "Attribut species der Klasse Animal ist nicht vom Typ String");
            assertTrue(Modifier.isProtected(s.getModifiers()), "Attribut species der Klasse Animal ist nicht protected");
        } catch (NoSuchFieldException e) {
            fail("Attribute der Klasse Animal existieren nicht.");
        }
    }

}