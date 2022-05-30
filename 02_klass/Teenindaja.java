public class Teenindaja {
    String nimi;
    int teenindaja_nr;
    Tellija tellija;

    public Teenindaja(String nimi, int teenindaja_nr){
        this.nimi=nimi;
        this.teenindaja_nr=teenindaja_nr;
    }

    public String getNimi(){
        return this.nimi;
    }
    public int getTeenindaja_nr(){
        return this.teenindaja_nr;
    }
    public String getTellija_nimi(){
        return this.tellija.getNimi();
    }
    public int getTellija_vanus(){
        return this.tellija.getVanus();
    }
    public int getTellija_laud(){
        return this.tellija.getLaud();
    }
    public void setTellija(Tellija tellija){
        this.tellija=tellija;
    }
}
