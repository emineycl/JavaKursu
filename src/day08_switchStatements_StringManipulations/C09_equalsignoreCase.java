package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C09_equalsignoreCase {
    public static void main(String[] args) {
        /*
        equalsIngareCase() verilen iki string'in metinsel esitligine buyuk-kucuk harf hassasiyeti olmadan bakar
         */
        String isim1 = " Kadir";
        String isim2 = "kadir";
        String isim3 = "Kadir ";
        System.out.println(isim1.equals(isim2)); //false
        System.out.println(isim1.equalsIgnoreCase(isim2)); //true
        System.out.println(isim1.equalsIgnoreCase(isim3)); //false
    }
            /*
        Kullanicidan gun ismini alin ve girilen gun ismine göre hafta ici veya hafta sonu yazdirin
         */

    { Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
    String gunIsmi = scan.next();
    String gun = gunIsmi.toLowerCase();

        if(gun.equalsIgnoreCase("Pazartesi")||gun.equalsIgnoreCase("sali")||gun.equalsIgnoreCase("carsamba")||
                gun.equalsIgnoreCase("persembe")||gun.equalsIgnoreCase("cuma"))

    {
        System.out.println("hafta ici");
    } else if(gun.equals("cumartesi")||gun.equals("pazar"))

    {
        System.out.println("haftasonu");

    } else

    {
        System.out.println("gecersiz gun ismi");
    }
}}