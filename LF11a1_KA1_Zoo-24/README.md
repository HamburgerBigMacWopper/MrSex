# LF11a1_KA1_Zoo: Programmieraufgabe für die Klausur

Ihnen liegt eine halbfertige Zooverwaltung vor. Modellieren und Programmieren Sie diese zu Ende.

## Animal
Vervollständigen Sie die Klasse ```Animal```, die die folgenden Attribute und Methoden hat:
* ```name: String``` Der Name des Tieres, inkl. Getter.
* ```species: String``` Die Art des Tieres, inkl. Getter.
* Konstruktor, der den Namen und die Art übernimmt.
* ```+hello(): String``` Eine abstrakte Methode

## Tiere
Definieren Sie die folgenden Klassen, die von der gegebenen Klasse ```Animal``` erben:
* ```Clownfish``` Die Konstruktorfunktion für ```Clownfish``` soll nur den Namen annehmen. Alle Clownfische gehören zur Art/Species "Clownfish" haben. Die Methode ```hello``` soll "Blub blub" und den Namen zurückgeben. Beispiel:
  > Blub Blub, mein Name ist Nemo.
* ```Mammal``` (Säugetier) Die Konstruktorfunktion für ```Mammal``` soll insgesamt 3 Argumente in der folgenden Reihenfolge annehmen: ```String name, String species, int legs``` und die Daten entsprechend speichern.
  Außerdem sollte die Methode ```hello``` für Säugetiere den Namen, die Spezies und die Anzahl der Beine ausgegeben. Beispiel:
  > , mein Name ist Benjamin und ich bin ein Elephant und habe 4 Beine.
* ```Elephant``` (ist ein ```Mammal```). Die Konstruktorfunktion für ```Elephant``` soll nur den Namen annehmen. Elefanten sollten immer eine Beinzahl von 4 und eine Art "Elephant" haben.
  Außerdem sollte die Methode ```hello``` für Elefanten mit "Törööö" beginnen. Beispiel:
  > Torooo, mein Name ist Benjamin und ich bin ein Elephant und habe 4 Beine.
* ```Kangaroo``` (ist ein ```Mammal```). Die Konstruktorfunktion für ```Kangaroo``` soll nur den Namen annehmen. Kängurus sollten immer eine Beinzahl von 2 und eine Art "Kangaroo" haben.
  Außerdem sollte die Methode ```hello``` für Kängeruh mit "Eier?" beginnen. Beispiel:
  > Eier?, mein Name ist Das Känguru und ich bin ein Kangaroo und habe 2 Beine.

## Gehegeverwaltung
In einem Gehege (```Enclosure```) können nur Tiere derselben Art (```species```) untergebracht werden. Die Klasse muss nicht implementiert werden, da sie bereits vorhanden ist. Analysieren Sie den Quellcode der Klasse für ihr Klassendiagramm.

## Aufgabe
Überlegen Sie, von welchen Klassen Objekte Sinn ergeben.
1. Erstellen Sie ein Klassendiagramm in OOD für diese 6 Klassen (Tiere & Gehege). Getter/Setter sind nicht notwendig. Die Klasse ```Zoo``` muss nicht modelliert werden.
2. Programmieren Sie die passenden Anforderungen. Die Mainklasse ```Zoo``` und das Gehege (```Enclosure```) sollen nicht angepasst werden. Nutzen Sie auch die Tests zum Überprüfen.

Laden Sie am Ende das gesamte Projekt und extra das Klassendiagramm in Moodle hoch.