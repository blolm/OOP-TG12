package E001Assoziationen;
public class Parkplatz {
    
    //Klassenvariable
    private static int anzahlGelöschterParkplaetze = 0;
    private static int anzahlEzeugterParkplätze = 0;

    //Objektvariable
    private int id;
    private String nummer;
    
    //Konstruktor
    public Parkplatz(String nr) {
        this.nummer = nr;

        //id erzeugen
        anzahlEzeugterParkplätze++;
        id = anzahlEzeugterParkplätze;
    }


    @Override
    protected void finalize() throws Throwable {
            anzahlGelöschterParkplaetze++;
            System.out.println("Parkplatz gelöscht");
    }


    public static int getAnzahlParkplätze() {
        return anzahlEzeugterParkplätze-anzahlGelöschterParkplaetze;
    }

        public int getId() {
        return id;
    }


    public String getNummer() {
        return nummer;
    }


    @Override
    public String toString() {
        return "Parkplatz [id=" + id + ", nummer=" + nummer + "]";
    }

    
}
