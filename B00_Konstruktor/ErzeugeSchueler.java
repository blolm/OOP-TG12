package B00_Konstruktor;

public class ErzeugeSchueler {
    
    public static void main(String[] args) {

        Schueler s1 = new Schueler("Meier","Max");
        Schueler s2 = new Schueler("Auer", "Niklas", "n.auer@web.de");

        System.out.println(s1.name);
        System.out.println(s2.email);
        System.out.println(s2.toString());
        System.out.println(s1);
        
    }
}
