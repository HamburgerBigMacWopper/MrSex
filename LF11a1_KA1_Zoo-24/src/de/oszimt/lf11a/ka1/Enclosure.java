package de.oszimt.lf11a.ka1;

import de.oszimt.lf11a.ka1.animals.Animal;

import java.util.ArrayList;

public class Enclosure {
    private final String name;
    private final String specs;
    private int maxAnimal;

    private final ArrayList<Animal> animals;

    public Enclosure(String name, String specs, int maxAnimal) {
        this.name = name;
        this.specs = specs;
        this.maxAnimal = maxAnimal;
        animals = new ArrayList<>();
    }

    public void setMaxAnimal(int maxAnimal) {
        this.maxAnimal = maxAnimal;
    }

    public String getName() {
        return name;
    }

    /**
     * Das Tier kann nur hingefügt werden, wenn die Art in diesem Gehege untergebracht wird, in dem Gehege genug Platz ist und das Tier nicht schon in dem Gehege ist..
     * @param a, Animal
     * @return true > hinzufügen erfolgreich; false > hinzufügen nicht erfolgreich
     */
    public boolean addAnimal(Animal a){
        if (!a.getSpecies().equals(specs)){
            return false;
        }
        if (animals.contains(a)){
            return false;
        }
        if (animals.size()==maxAnimal){
            return false;
        }

        animals.add(a);
        return true;
    }

    /**
     * Entfernt das Tier aus diesem Gehege, wenn es im Gehege war.
     * @param a, Animal
     * @return true > entfernen erfolgreich; false > entfernen nicht erfolgreich
     */
    public boolean removeAnimal(Animal a) {
        if (animals.contains(a)){
            animals.remove(a);
            return true;
        }
        return false;
    }

    /**
     * Ist dieses Tier im Gehege?
     * @param a, Animal
     * @return true > enthält Tier; false > enthält nicht Tier
     */
    public boolean containsAnimal(Animal a){
        return animals.contains(a);
    }
}
