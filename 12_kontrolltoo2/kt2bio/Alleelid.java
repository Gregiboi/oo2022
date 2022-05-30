package kt2bio;

public class Alleelid {
String nimi;
public boolean posorneg;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public boolean isPosorneg() {
        return posorneg;
    }

    public void setPosorneg(boolean posorneg) {
        this.posorneg = posorneg;
    }

    public Alleelid(String nimi, String posorneg){
        this.nimi = nimi;

        if(posorneg.equals("pos")){
            this.posorneg = true;
        }else{
            this.posorneg = false;
        }

    }
}
