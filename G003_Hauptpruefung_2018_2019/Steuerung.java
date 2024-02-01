package G003_Hauptpruefung_2018_2019;

public class Steuerung {
    
    Tisch[] derTisch;
    Produkt[] dasProdukt;

    public Steuerung(){
        derTisch = new Tisch[10];
        dasProdukt = new Produkt[6];
    }

    public void bestellen(int tischNr, int persNr, int prodNr){
        derTisch[tischNr].bestellen(persNr,dasProdukt[prodNr]);
    }
}
