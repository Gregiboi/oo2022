public class Tellija {
    String nimi;
    int vanus;
    int laud;

    public Tellija(String nimi, int vanus, int laud){
        this.nimi=nimi;
        this.vanus=vanus;
        this.laud=laud;
    }

    public String getNimi(){
        return this.nimi;
    }

    public int getVanus(){
        return this.vanus;
    }

    public int getLaud(){
        return this.laud;
    }

    @Override
    public String toString(){
        return "Tellija nimi on: " + nimi + "\nTellija vanus on: " + vanus + "\nTellija laud on: "+ laud + "\n";
    }
}
