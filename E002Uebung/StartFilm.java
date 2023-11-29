package E002Uebung;

import java.util.ArrayList;

public class StartFilm {
    public static void main(String[] args) {
        
        //Objekt erzeugen
        Regisseur r1 = new Regisseur("Lucas");
        Regisseur r2 = new Regisseur("Darobont");
        Regisseur r3 = new Regisseur("Gibson");

        Film f1 = new Film("Star Wars", r1);
        Film f2 = new Film("Braveheart", r3);
        Film f3 = new Film("Der Verurteilte", r2);


        //Werte setzen
        r1.setVorname("Georg");
        f1.setFsk(16);
        r3.setBeschreibung("Ich hab keine Ahnung wer das ist");
        f1.setDauer(120);


        //Film löschen
        f2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

        //Ausgeben
        System.out.println("Anzahl Filme: " + Film.getAnzahlFilme());     //Wieso muss hier Film.?
        
        System.out.println(f1);
        System.out.println(f2);     //-> wenn gelöscht dann Ausgabe Null?
        System.out.println(f3);
       



        //Alle Filme in eine Liste
    /*         
        ArrayList<Film> dieFilme = new ArrayList<>();
        dieFilme.add(f1);
        dieFilme.add(f2);
        dieFilme.add(f3);

        System.out.println(dieFilme);   //-> Kein Zeilenumbruch?
    */



        //Ausgabe nur einer bestimmten Sache. geht nur wenn es keine gelöschten Filme gibt? NullPointerException?
    /* 
        for (Film filme : dieFilme){
            System.out.println(filme.getTitel());

    }*/   
        
    }

}
