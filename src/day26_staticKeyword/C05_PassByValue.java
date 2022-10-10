package day26_staticKeyword;

public class C05_PassByValue {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println(method1(sayi));  //100   //kalici degistirmek isteseydik atama yapacaktik
                                                     // sayi=method1(sayi); 100 sayi degeri 100 olarak yazilacakti

        System.out.println(sayi);   //10

    }

    public static int method1(int sayi) {
        sayi=sayi*sayi;

        return sayi;

    }
}
