package E002Uebung;

public class Film {
    
    Regisseur derRegisseur; //Zeiger auf Klasse Regisseur

    private int id;
    private String titel;
    private int dauer;
    private int fsk;
    private static int anzahlErzFilme = 0;
    private static int anzahlGelFilme = 0;


    public Film(String titel, Regisseur r) {
        this.derRegisseur = r;
        this.titel = titel;
        anzahlErzFilme++;
        id = anzahlErzFilme;
    }


    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }


    public void setTitel(String titel) {
        this.titel = titel;
    }


    public int getDauer() {
        return dauer;
    }


    public void setDauer(int dauer) {
        this.dauer = dauer;
    }


    public int getFsk() {
        return fsk;
    }


    public void setFsk(int fsk) {
        this.fsk = fsk;
    }


    public static int getAnzahlFilme() {
        return anzahlErzFilme-anzahlGelFilme;
    }


    @Override
    public String toString() {
        return "  ";
    }

    public Regisseur getRegisseur() {
        return derRegisseur;
    }

    public void setRegisseur(Regisseur derRegisseur) {
        this.derRegisseur = derRegisseur;
    }

    @Override
    protected void finalize() throws Throwable {
        anzahlGelFilme++;
    }


    
}
