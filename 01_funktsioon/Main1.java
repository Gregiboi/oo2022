import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(weight());
        System.out.println(length());
        BMIcalc();
    }
    public static float weight() {
        System.out.println("Sisestage oma kaal (lb): ");
        Scanner scanner = new Scanner(System.in);
        String weightkg = scanner.nextLine();
        return (int) ((Double.parseDouble(weightkg))/2.205);
    }
    public static float length() {
        System.out.println("Sisestage oma pikkus (inches): ");
        Scanner scanner = new Scanner(System.in);
        String lengthcm = scanner.nextLine();
        return (int) ((Double.parseDouble(lengthcm))*2.54);
    }
    public static void BMIcalc() {
        System.out.print("BMI kalkulaator\nSisesta oma kaal (kg): ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        System.out.print("Sisestage oma pikkus (cm): ");
        float height = scanner.nextFloat();
        float bmi = (100 * 100 * weight) / (height * height);
        System.out.println("BMI tulemus on: " + bmi);
        BMIcount(bmi);
    }
    public static void BMIcount(float bmi) {
        if (bmi < 18.5) {
            System.out.println("Alakaal");
        } else if (bmi < 25) {
            System.out.println("Normaalkaal");
        } else if (bmi < 30) {
            System.out.println("Ülekaal");
        } else {
            System.out.println("Oled vaal");
        }
    }
}

