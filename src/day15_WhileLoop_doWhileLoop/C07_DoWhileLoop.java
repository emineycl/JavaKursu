package day15_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {

                /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin
          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int sayac=0;
        int sayilarinToplami=0;

        do {
            System.out.println("Toplanmak uzere pozitif bir tamsayi girin" +
                    "\nbitirmek icin 0'a basin");
            sayi=scan.nextInt();
            if (sayi==0){
                continue; //continue kod'un birsey yapmadan devam etmesini istedigimizde kullanilir
            }else if (sayi<0) {
                System.out.println("Negatif sayi kullanamazsiniz");
            }else {
                sayilarinToplami+=sayi;
                sayac++;
            }
        }while (sayi!=0);
        System.out.println("Girilen " + sayac+ " adet pozitif tamsayinin toplami : " + sayilarinToplami);
    }
}