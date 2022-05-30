package kt2bio;

import java.util.Random;
import java.util.Scanner;

public class Vanemad {
    Random random = new Random();
    String isaNimetus;
    String emaNimetus;
    boolean isaVaartus = random.nextBoolean();
    boolean emaVaartus = random.nextBoolean();

    public String getEmaNimetus() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta ema alleeli nimetus: ");
        emaNimetus = scanner.next();
        return emaNimetus;
    }
    public String getIsaNimetus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta isa alleeli nimetus: ");
        isaNimetus = scanner.next();
        return isaNimetus;
    }
    public String getIsaVaartus() {
        if (isaVaartus == true) {
            return "pos";
        } else {
            return "neg";
        }
    }
    public String getEmaVaartus() {
        if (emaVaartus == true) {
            return "pos";
        } else {
            return "neg";
        }
    }
}
