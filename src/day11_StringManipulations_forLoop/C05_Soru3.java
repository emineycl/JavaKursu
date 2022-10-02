package day11_StringManipulations_forLoop;

public class C05_Soru3 {
    public static void main(String[] args) {
        /*
          Kullanicinin String olarak verdigi iki fiyati
          toplayabilen bir kod yaziniz
         */

        String fiyat1="$20.25";
        String fiyat2="$30.40";

        fiyat1=fiyat1.replaceAll("\\D","");    //Karakterleri yok etmek icin replaceAll(\\D,"")
        fiyat2=fiyat2.replaceAll("\\D","");
        System.out.println(fiyat1+fiyat2);  //20253040

       /* Integer sayi1=Integer.parseInt(fiyat1);
        Integer sayi2=Integer.parseInt(fiyat2); */
        Double sayi1=Double.parseDouble(fiyat1);
        Double sayi2=Double.parseDouble(fiyat2);

        System.out.println("sayi1  :" + sayi2);
        System.out.println("sayi2  :" + sayi1);

        System.out.println("sayi1 + sayi2 : $" + (sayi1+sayi2)/100);

        /*
        parseInteger veya parseDouble
        String olarak girilen ancak TAMEMEN SAYILARDAN olusan bir ifadeyi
        int veya double'a cevirir
                */
    }
}
