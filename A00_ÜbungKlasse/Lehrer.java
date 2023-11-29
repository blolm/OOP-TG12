package A00_ÜbungKlasse;

public class Lehrer {
    

    //Objektattribute
    private String name;
    private String kuerzel;


    //Konstruktor 
    public Lehrer(){

        name = "Hammer";
        setKuerzel("hr");
    }

    
    //Getter 
    public String getName() {
        return name;
    }
    public String getKuerzel() {
        return kuerzel;
    }


    //Setter
    public void setName(String name) {
        this.name = name;                   //"this." wird nur gebruacht wenn der String gleich heißt wie der Übergabe Parameter 
   }
                                                              

    public void setKuerzel(String neuesKuerzel) {

        if (neuesKuerzel.length()==2){
            kuerzel = neuesKuerzel; 
        }

     
    }

    
}
