package G003_Hauptpruefung_2018_2019;

public class Gui {

    Steuerung dieSteuerung;
    
    public Gui(Steuerung pSteuerung){
        dieSteuerung = pSteuerung;
    }

    public void clickedBestellen(){



            int tischNr = 1;
            int persNr = 1;
            int prodNr = 1;
            dieSteuerung.bestellen(tischNr,persNr,prodNr);
    }
}