package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun isminini alin ve girilen gun ismine göre tatilmi variable'ini hafta sonu icin true
        hafta ici icin false olarak atayin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi= scan.next().toLowerCase();   //.toLowerCase hepsini kucuk harf yapar

        /*
        string ifadeler case-sensitive'dir
        (buyuk -kucuk harf duyarlidir)
        Pazartesi,pazartesi,PAzartesi,..... hep farkli String'lerdir
         */


        /*
        Kullanicinin girdigi degeri kodumuzu calistirmak ve dogru sonuclara ulasmak icin degistirebiliriz
        ama bu durumda kullanicinin girdigi deger degismis veya kaybolmus olur

        Kullanicinin girdigi degeri korumak icin , ikinci bir variable'i kullanmak , degistirmek daha uygun olur
         */

        boolean tatilMi= false;

        switch (gunIsmi){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Bugun hafta ici ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Bugun haftasonu");

                break;
            default:
                System.out.println(gunIsmi+" Gecersiz gun ismi");

        }

      /*  if (tatilMi) {
            System.out.println("Bugun " + gunIsmi + " iyi dinlenin");
        } else if (true){System.out.println("Bugun " + gunIsmi+ " Simdi calisma zamani");
    }
    */}

}
