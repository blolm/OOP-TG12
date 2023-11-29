package E002Uebung;
public class Regisseur {

    private String name;
    private String vorname;
    private String beschreibung;



    public Regisseur(String name) {
        this.name = name;

    }




    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }





    public String getVorname() {
        return vorname;
    }





    public void setVorname(String vorname) {
        this.vorname = vorname;
    }





    public String getBeschreibung() {
        return beschreibung;
    }





    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

  @Override
    public String toString() {
        return "Regisseur [name=" + name + ", vorname=" + vorname + ", beschreibung=" + beschreibung + "]";
    }


}
