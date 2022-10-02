package day02_scanner_dataCasting;

public class C08_Datacasting {
    public static void main(String[] args) {
        double doubleSayi = 23.4;
        int intSayi= (int)doubleSayi;
        System.out.println(intSayi); //23

        //Verilen 3 tamsayinin ortalamasini yazdirin

        int sayi1=12;
        int sayi2= 13;
        int sayi3= 16;

        System.out.println((sayi1+sayi2+sayi3)/3); // 41/3=13.66666 ==> 13

        /*
        eger islem yapilan tum sayilar int ise java sonucuda integer verir
        ama sayilardan biri int , digeri double olursa
        sayilardan biri double olursa, sonucu genis olana otomatik cast eder

         */

        double sayi4= 15;
        System.out.println((sayi1+sayi4)/2);  //  27/2=13,5  ==> 13.5


        //verilen 3 tamsayinin ortalamasini double yazdirin

      /*  double sayi5= 16;
        double sayi6= 24;
         System.out.println((sayi4+sayi5+sayi6)/3); // 55/3 ==> 18.333333332
          //ben yaptim.
       */

    System.out.println(((double)sayi1+sayi2+sayi3)/3); // 13,6666666666
    }
}
