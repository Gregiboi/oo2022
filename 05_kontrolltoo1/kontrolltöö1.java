import java.util.ArrayList;
import java.util.Scanner;

//kontrolltöö - algarvud
public class kontrolltöö1{

    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList<Integer> blist = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta algarv: ");
        int algarv = scanner.nextInt();
        boolean jagub = false;
        if(algarv%2==0){
            System.out.println("Teie arv jagub kahega!");
            jagub = true;
        }
        if(algarv%3==0){
            System.out.println("Teie arv jagub kolmega!");
            jagub = true;
        }
        if(algarv%5==0){
            System.out.println("Teie arv jagub viiega!");
            jagub = true;
        }
        if(algarv%7==0) {
            System.out.println("Teie arv jagub seitsmega!");
            jagub = true;
        }
        if(jagub == false){
            System.out.println("Teie arv ei jagu kahe, kolme, viie ega seitsmega!");
        }
        System.out.println("Number " + algarv + " on algarv; " + onAlgarv(algarv));

        for(int i = 2; i <= 7919; i++){
            if (onAlgarv(i)) {
                alist.add(i);
            }
        }
        System.out.println("Algarvud on: " + alist);

        int tuhruut = alist.get(alist.size()-1) * alist.get(alist.size()-1);
        int count = tuhruut;
        while(blist.size() <= 10){
            if (onAlgarv(count)) {
                blist.add(count);
            }
            count--;
        }
        System.out.println("Kümme esimest 1000. algarvu ruudust väiksemat algarvu on: " + blist);
    }

    private static boolean onAlgarv(int algarv){

        for(int i = 2; i <= algarv / 2; i++) {
            if(algarv % i == 0) {
                return false;
            }
        }
        return true;

    }
}
