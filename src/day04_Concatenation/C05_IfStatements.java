package day04_Concatenation;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen”
        //yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini tamsayi olarak giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Girilenn ucgen bir eskenar ucgen");
        }



    }
}