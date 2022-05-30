public class Main2 {

    public static void main(String[] args) {
        Teenindaja bob = new Teenindaja("Bob",1);
        Tellija rob = new Tellija("Rob", 18,2);
        bob.setTellija(rob);
        System.out.println("Teie tellija vanus: " + bob.getTellija_vanus() + "\nLaua nr: " + bob.getTellija_laud());
    }


}
