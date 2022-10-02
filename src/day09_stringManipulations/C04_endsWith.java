package day09_stringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        /*
        Verilen bir String'de kullanicidan alacaginiz metin icin asagidaki
        siklardan uygun olani yazdirin
         */

        String str = "Java cok guzel, cok.";

        System.out.println(str.endsWith("cok"));  //false
        System.out.println(str.endsWith("cok."));  //true
        System.out.println(str.endsWith(""));  //true

        /*
        kullanicidan bir mail alin
        -mail @  icermiyorsa "gecersiz mail"
        -sifre @gmail.com icermiyorsa , " mail gmail olmali"
        -sifre @gmail.com ile bitmiyorsa , "mailde yazim hatasi var"
        yazdiralim.
        eger bu hatalar yoksa "mailiniz basari ile kaydedildi
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail giriniz");
        String mail = scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("gecersiz mail");
        } else if
            (!mail.contains("@gmail.com")) {
                System.out.println("mail gmail olmali");
            } else if (!mail.endsWith("@gmail.com")) {
                System.out.println("mailde yazim hatasi var");

            } else {
                System.out.println("Mailiniz basari ile kaydedildi");
            }


        }
    }

