package day10_stringManipulations;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {

        /*
          Kullanicidan ismini, soyismini ve kk numarasini alip
          asagidaki formatta kaydedip, yazdiralim
          M***** T****
          1234  **** **** ****
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen Soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Lutfen KK numarinizi giriniz");
        String kkNo=scan.nextLine();

        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\n","*")+"  "+
                soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\n","*");
        String yeniKKNo=kkNo.substring(0,4)+"**** **** ****";
        System.out.println(yeniIsim+"\n"+yeniKKNo);

        System.out.println();
    }
}
