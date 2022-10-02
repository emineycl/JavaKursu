package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str= "Java cok guzel, cok.";

        System.out.println(str.contains("Java")); //true
        System.out.println(str.contains("java")); //false
        System.out.println(str.contains("cok")); //true


        /*
        contains() bir String'in istedigimiz bir char veya String'i icerip icermedigini kontrol eder
        contains() arananString'in kac atne olduguna bakmaz , sadece icerip icermedigine bakmaz,sadece icerip
        icermedigini kontrol eder
         */

        /*
        CharSequence ==> CharZinciri diye dusunebiliriz ve String diyebiliriz
        her String char'lardan olusan bir zincir diyebiliriz
        contains() char kabul etmez, CharSequence ister
         */

        System.out.println(str.contains("a"));  //true
        System.out.println(str.contains( " "));   //true
        System.out.println(str.contains(""));   //true
    }
}
