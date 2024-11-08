package de.oszimt.lf11a.ka1;

import de.oszimt.lf11a.ka1.animals.*;

public class Zoo {
    public static void main(String[] args) {
        //Alle Gehege anlegen
        Enclosure elephantEnclosure = new Enclosure("Elefantengehege","Elephant", 1);
        Enclosure fishEnclosure = new Enclosure("Clownfischaquarium","Clownfish", 50);

        //Tiere anlegen
        Elephant benjamin = new Elephant("Benjamin");
        Elephant otto = new Elephant("Otto");
        Clownfish nemo = new Clownfish("Nemo");
        Clownfish dorie = new Clownfish("Dorie");
        Kangaroo kanguru = new Kangaroo("Das Känguru");

        //Tiere in Gehege packen
        addAnimalEnclosure(fishEnclosure, nemo); //soll erfolgreich sein
        addAnimalEnclosure(fishEnclosure, dorie); //soll erfolgreich sein
        addAnimalEnclosure(fishEnclosure, nemo); //soll nicht erfolgreich sein, da schon drin

        addAnimalEnclosure(elephantEnclosure, benjamin); //soll erfolgreich sein
        addAnimalEnclosure(elephantEnclosure, otto); //soll nicht erfolgreich sein, da kein Platz
        addAnimalEnclosure(elephantEnclosure, kanguru); //soll nicht erfolgreich sein, da falsche Rasse

        removeAnimalEnclosure(elephantEnclosure, otto); //soll nicht erfolgreich sein, da nicht drin
        removeAnimalEnclosure(elephantEnclosure, benjamin); //soll erfolgreich sein
        addAnimalEnclosure(elephantEnclosure, benjamin); //soll erfolgreich sein
    }

    private static void addAnimalEnclosure(Enclosure e, Animal a){
        System.out.println(a.hello());
        if (e.addAnimal(a)){
            System.out.println(a.getName()+" wurde in das Gehege "+e.getName()+" angesiedelt.");
        } else {
            System.out.println("!"+a.getName()+" konnte nicht im Gehege "+e.getName()+" angesiedelt werden.");
        }
    }

    private static void removeAnimalEnclosure(Enclosure e, Animal a){
        if (e.removeAnimal(a)){
            System.out.println(a.getName()+" wurde aus dem Gehege "+e.getName()+" genommen.");
        } else {
            System.out.println("!"+a.getName()+" konnte nicht aus dem Gehege "+e.getName()+" genommen werden.");
        }
    }
}
