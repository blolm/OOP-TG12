package C00_Vererbung;

import java.util.ArrayList;

public class Startklasse {
    
    public static void main(String[] args) {
       

        //Schuelerobjete erzeugen
        Schueler s1 = new Schueler("Meier", "Max");
        Schueler s2 = new Schueler("Hammer", "Niko", "nh@web.de");
        
        //alle Schüler in eine Liste
        ArrayList<Schueler> dieSchueler = new   ArrayList<>();             //generischer Datentyp -> in Klammern <> -> nur Schüler
        dieSchueler.add(s1);
        dieSchueler.add(s2);
        
        //alle Schueler ausgeben
        System.out.println(dieSchueler);

        //alle schueler ausgeben
        for (Schueler schueler : dieSchueler) {
            System.out.println(schueler.getName());
        }
    }
}

