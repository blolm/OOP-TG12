package D003Polymorphie;

public class Mitarbeiter {
    int anzahlStunden;
    int stundenLohn;
    
    
    public Mitarbeiter(int anzahlStunden, int stundenLohn) {
        this.anzahlStunden = anzahlStunden;
        this.stundenLohn = stundenLohn;
    }



    public double berechneGehalt(){        
        return anzahlStunden * stundenLohn;
    }
}
