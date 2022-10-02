package day02_scanner_dataCasting;

import java.util.Scanner;

public class C09_Datacasting {
    public static void main(String[] args) {


      int intSayi=140;
      byte byteSayi=(byte)intSayi;

      System.out.println("intsayi : " + intSayi+ "`yi byte cevirirsek degeri: " +byteSayi); //-116

        /*
        Özet data casting :
        1- Eger kucuk data turundeki datayi, buyuk data turundeki variable'a atama yaparsak -- otomatik genisler
        2. tam tersinde data kaybi (ondalilkli kismi )veya dönusum olabilir
         */

    }
}
