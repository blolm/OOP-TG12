# Polymorphie in der OOP

Es gibt zwei Arten von Polymorphie in der OOP.

1. Statische Polymorphie 
2. Dynamische Polymorphie

## Statische Polymorphie
Mit statischer Polymorphie ist das überladen von Methoden innerhalb einer Klasse gemeint. D.h. eine Methode kommt immer in einer Klasse mehrfach vor und unterscheidet sich nur durch die Übergabeparameter.

1. Beispiel in Java:
````java
class Schueler{

    //Objektattribute
    private String name;
    private String vorname;

    //Konstruktor 
    public Schueler(){
        name="Mustermann";
        vorname="Max";
    }

    //Überladenen Konstruktor 
    public Schueler(String name){
        this.name=name;
        vorname="Max"
    }
}
````
2. Beispiel in Java:
````java
class Uhr{

    //...

    public void setUhrzeit(int stunden){
        //...
    }

    public void setUhrzeit(int stunden, int minuten){
        //...
    }
}
````
>Bei statischer Polymorphie ist direkt beim Aufruf der Methode erkennabr, welche der überladenen Methoden ausgeführt werden muss. 
>
>````java
>Schueler s1 = new Schueler("Maier");    //-> überladner Konstruktor
>Schueler s2 = new Schueler();           //-> Standart Konstruktor
>//...
>dieUhr.setUhrzeit(13,15);               //-> setUhrzeit mit Stunden und Minuten
>dieUhr.setUhrzeit(13);                  //-> setUhrzeit nur mit Stunden
>````
><br />

<br />

## Dynamische Polymorphie
Gibt es in einer Vererbungshierarchie mindestens zwei überschriebene Methoden, so ist diese Methode polymorph. 

1. Beispiel:
````java
public class Mitarbeiter{

    public double berechneGehalt(){
        return anzahlStunden * Stundenlohn;
    }
}

public class Abteilungsleiter extends Mitarbeiter{
 
    @Override
    public double berechneGehalt(){
        return anzahlStunden * Stundenlohn + zulage;
    }
}
````

Folgendes gilt hier:
- die Methode `berechneGehalt()` in der Klasse Abteilungsleiter wurde überschrieben. D.h. der gleiche Methodenname mit der gleichen Signatur (Rückgabewert, Übergabeparameter) wird in einer erbenden Klasse mit neuem Code implementiert.
- es existiert bereits eine Implementierung in der Oberklasse

<br />

Daraus folgt:
>- Es existieren 2 Implementierungen einer Methode in einer Vererbungshierarchie. 
>- Die Methode ist polymorph. 
>- Welche Methode ausgeführt wird entscheidet sich erst zur Laufzeit.

Beispiel:
````Java
ublic static class Startklasse{

    public static void main(String[]args){

        Mitarbeiter m1 = new Mitarbeiter();
        Abteilungsleiter a1 = new Abteilungsleiter();

        double gehalt1 = m1.berechneGehalt();
        double gehalt2 = a2.berechneGehalt();
    }
}
````