package day02_scanner_dataCasting;

import java.util.Scanner;

public class C07_Scanner_ {
    public static void main(String[] args) {

        /*Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Isminizi yaziniz ");
        String isim= scan.nextLine();

        System.out.println("Soyisminizi yaziniz ");
        String soyisim= scan.nextLine();

        System.out.println("Yasinizi yaziniz ");
        int yas= scan.nextInt();

        System.out.println("\nGirilen bilgiler: " +isim + " " + soyisim +"," + yas  );


    }
}
