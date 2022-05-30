package kodutoo._67;


public class Divisions {
    DivisionsEnum de;

    public Divisions(DivisionsEnum de) {
        this.de = de;
    }

    public int getCOMBATWIDTH(){
        return this.de.getCOMBATWIDTH();
    }

    public int getATTACK(){
        return this.de.getATTACK();
    }

    public int getDEFENSE(){
        return this.de.getDEFENSE();
    }

    public int getHP(){
        return this.de.getHP();
    }

    public int getORG(){
        return this.de.getORG();
    }
}
