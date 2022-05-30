import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Teretulemast teenindusportaali!");
        Teenindaja bob = new Teenindaja("Bob", 1);
        Tellija tellija = null;

        while(true) {
            System.out.println("1. Lisa Tellja\n" + "2. Vaata Tellijat\n" + "3. Lahku rakendusest.");
            System.out.println("Vali järgnev tegevus (1/2/3):");
            Scanner scanner = new Scanner(System.in);
            int valik = 0;

            try {
                valik = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Sisesta korrektne sisend!");
            }

            if (valik == 1) {
                System.out.println("Sisesta tellija nimi: ");
                String nimi = scanner.next();
                System.out.println("Sisesta tellija vanus: ");
                int vanus = scanner.nextInt();
                System.out.println("Sisesta tellija laud: ");
                int laud = scanner.nextInt();
                tellija = new Tellija(nimi, vanus, laud);
                bob.setTellija(tellija);
                System.out.println("\nTellija lisatud!\n");

            } else if (valik == 2) {
                if (tellija == null){
                    System.out.print("Tellijaid pole!\n");
                } else {
                    System.out.println(tellija +
                            "\n" +
                            bob.getTellija_nimi() + " teenindaja: " +
                            bob.getNimi() + "; id: " +
                            bob.getTeenindaja_nr() +
                            "\n");
                }

            } else if (valik == 3) {
                break;
            }
        }
    }
}
