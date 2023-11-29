package B00_Konstruktor;


public class Schueler {
        
    //Objekvariable
    String name;
    String vorname;
    String email; 

    //Konstruktor 
    public Schueler(String name, String vorname){

        this.name = name;
        this.vorname = vorname;
        this.email = null;
    }

    public Schueler(String name, String vorname, String email){

        this(name,vorname); //Aufruf des Konstruktors mit 2 String Übergabeparametern. Bei Verkettung muss diese Zeile als erstes im 2. Konstruktor stehen
        this.email =email;

    }

    @Override //Überschreibt die Methode aus einer Oberklasse
    public String toString() {
        // TODO Auto-generated method stub
        return name+" "+vorname+" "+email; //ToString aussehen in der Konsole
    }

}


