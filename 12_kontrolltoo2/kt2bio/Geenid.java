package kt2bio;

import java.io.*;
import java.util.Random;

public class Geenid {
    private boolean posorneg;
    private boolean viga = false;
    private int randomAlleel;
    private Alleelid alleel1, alleel2, selectedAlleel, uueGeeniAlleel, lapseAlleel;
    private Geenid uusGeen, lapseGeen;


    public Geenid(Alleelid alleel1, Alleelid alleel2){
        if(alleel1.nimi.equals(alleel2.nimi)){
        this.alleel1 = alleel1;
        this.alleel2 = alleel2;
        }
        else{
            viga = true;
        }
    }

    public boolean createGene(){

        if(alleel1.posorneg == true||alleel2.posorneg == true){
            posorneg = true;
        }else{
            posorneg = false;
        }
        return posorneg;
    }

    public Alleelid selectRandomAlleel(){
        randomAlleel = (Math.random() <= 0.5) ? 1 : 2;
        if(randomAlleel == 1){
            System.out.println(alleel1.nimi + " " + alleel1.posorneg);
            selectedAlleel = alleel1;
        }
        else if(randomAlleel  == 2){
            System.out.println(alleel2.nimi + " " + alleel2.posorneg);
            selectedAlleel = alleel2;
        }
        return selectedAlleel;
    }

    public Geenid createNewGene(Geenid geen1, Geenid geen2){
        uusGeen = new Geenid(geen1.selectRandomAlleel(),geen2.selectRandomAlleel());
        return uusGeen;
    }

    public boolean isPosorneg() {
        return posorneg;
    }

    public boolean isViga() {
        return viga;
    }

    public Geenid lapseGeen(Alleelid isaAlleel, Alleelid emaAlleel)throws IOException{
        lapseAlleel = emaAlleel;
        lapseGeen = new Geenid(isaAlleel,emaAlleel);
                PrintWriter printwriter1 = new PrintWriter(
                new FileWriter("kt2bio/geen.txt")
            );
            printwriter1.println(lapseAlleel.nimi + " " + lapseGeen.posorneg);
            printwriter1.close();
        return lapseGeen;
    }
}