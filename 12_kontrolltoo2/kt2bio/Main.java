package kt2bio;

import java.io.IOException;


public class Main{
    static Vanemad vanemad = new Vanemad();
    Alleelid alleelid;

    public static void main(String[] arg) throws IOException {
        String isaNimetus = vanemad.getIsaNimetus();
        String emaNimetus = vanemad.getEmaNimetus();

        Alleelid a = new Alleelid(isaNimetus, vanemad.getIsaVaartus());
        Alleelid b = new Alleelid(isaNimetus, vanemad.getIsaVaartus());
        Alleelid c = new Alleelid(emaNimetus, vanemad.getEmaVaartus());
        Alleelid d = new Alleelid(emaNimetus, vanemad.getEmaVaartus());

        Geenid geen1 = new Geenid(a, b);
        Geenid geen2 = new Geenid(c, d);
        Geenid uusGeen = geen1.createNewGene(geen1, geen2);
        geen1.lapseGeen(a, c);

        if(geen1.isViga() == false){
            System.out.println("Loodi geen: " + geen1.createGene());
        }else{
            System.out.println("Alleenid ei ole õiged!");
        }
        geen1.selectRandomAlleel();
        System.out.println("Suvaline alleel on: " + uusGeen.isPosorneg());
    }
}