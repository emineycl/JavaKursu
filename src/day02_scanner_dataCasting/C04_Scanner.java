package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        /*
        soruu 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        Isminiz: Jhon
        Soyisminiz: Doe
        Yasiniz: 44
        Kayydiniz basariyla tamamlanmistir.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("lutfen yasinizi girin");
        int yas= scan.nextInt();

        System.out.println("Isminiz: " + isim + " \nSoyisminiz : " + soyisim + "\nYasiniz: " + yas);

        /*
        String ile scan.next() ve scan.nextline() kullanilabilir
        next() sadece ilk space`e kadar olan kismi alirken nextline() tum satiri alir

        Arka arkaya birden fazla String degeri kullanicidan alinacaksa hata olmamasi icin nextline() kullanilmasi daha
        olur

         */
    }
}
