package G002_VoSaSequenzdiagrammS29EinseitigeVerzweigung;

import java.util.ArrayList;

public class Akteur {

    public static void main(String[] args) {
        Klasse1a object1 = new Klasse1a();

        object1.op1();

        ArrayList<String> tg12 = new ArrayList();

        tg12.add("max");
        tg12.add("moritz");
        tg12.add("fritz");
        
        for (String s : tg12) {
        System.out.println(s);
        
        }

        System.out.println("-------");

        for (int i; i < tg12.size(); i++){
            System.out.println(tg12.get(i));
        }
    }
}