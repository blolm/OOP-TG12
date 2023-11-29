package C00_Vererbung;

public class Schueler extends Person {

    private String email;

    public Schueler(String name, String vorname) {
        super(name, vorname);           //Super sucht in der Oberklasse. Klammern bedeuten sucht nach Methode // Super muss erster Befehl sein                        
        email = null;
    }

    public Schueler(String name, String vorname, String email) {
        super(name, vorname);           // wenn überladen eines Konstruktors darf es nur einen Konstruktor geben mit der Anzahl an Atributen
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + " email=" + email;
        
    }

    
    
}