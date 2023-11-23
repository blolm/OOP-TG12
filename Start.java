public class Start {
    
    public static void main(String[] args) {
        
        //Objekt erstellen
        Parkplatz p1 = new Parkplatz("A1");
        Parkplatz p2 = new Parkplatz("A2");
        Parkplatz p3 = new Parkplatz("A3");
        Parkplatz p4 = new Parkplatz("A4");
        p3 = null;

        //Garbage Collector anstoßen
        System.gc();

        //Warten
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Anzahl Parkplätze: "+Parkplatz.getAnzahlParkplätze());

        Person max = new Person("Meier", p1);
        System.out.println(max);
        
        System.out.println(max.getParkplatzNr());
    }

}
