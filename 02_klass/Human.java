public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;
    char symbol;

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
        this.symbol = 'R';
    }

    // to ---> võtan toString() --> enter

    public void sayHello() {
        System.out.println(nimi + " ütleb hello");
    }

    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                ", symbol=" + symbol +
                '}';
    }
}
