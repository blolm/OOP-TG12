# Aufgabe zu Konstruktoren

1. Erstellen Sie eine Klasse `Schueler` mit den Attributen Name, Vorname und email.


````java
public class Schueler {
        
    //Objekvariable
    private String name;
    private String vorname;
    private String email; 
}
````

2. Ein Schuelerobjekt darf nur erstellt werden, wenn der Name und der Vorname bekannt ist. Ergänzen Sie die Klasse `Schueler`.
   
   
````java
public Schueler(String name, String vorname){

        this.name = name;
        this.vorname = vorname;
        this.email = null;
}
````
3. Ein Schueler soll auch mit einer Email-Adresse direkt erstellt werden können. Ergänzen Sie die Klasse `Schueler` um einen weietren Konstruktor und verketten sie diesen mit dem bereits vorhandnen Konstruktor.

````java
    
````
4. Erzeugen Sie die Schuelerobjekte `Max Meier` mit der Emailadresse `mm@web.de` und `Julian Nagelsmann` ohne Emailadresse in einer ausführbaren Klasse `ErzeugeSchueler.java`.

````java
    
```` 

5. Die Daten der Schueler sollen auf der Konsole ausgegeben werden. Überschreiben Sie die `toString()`-Methode aus der Klasse `Object`.

````java
    
````
