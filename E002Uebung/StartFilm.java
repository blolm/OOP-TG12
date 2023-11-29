package E002Uebung;

public class StartFilm {
    public static void main(String[] args) {
        
        //Objekt erzeugen
        Regisseur r1 = new Regisseur("Spielberg");
        Regisseur r2 = new Regisseur("Darobont");
        Regisseur r3 = new Regisseur("Gibson");

        Film f1 = new Film("Star Wars", r1);
        Film f2 = new Film("Braveheart", null);
        Film f3 = new Film("Der Verurteilte", r2);


        //Werte setzen
        r1.setVorname("Spielberg");
        f1.setFsk(16);
        
    }

}
