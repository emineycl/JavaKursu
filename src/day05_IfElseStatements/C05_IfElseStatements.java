package day05_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //video 1:23:00
        // Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenChar=scan.next().charAt(0);

        // char bir ifade karakter bir isleme girince sonucu ascii tablosundan deger alir () *
        if (girilenChar>='a' &&  girilenChar<='z') {
            System.out.println((char)(girilenChar-32));
        } else {
            System.out.println(girilenChar);
        }



    }
}
