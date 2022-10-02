package day08_switchStatements_StringManipulations;

import java.util.Locale;

public class C13_substring {
    public static void main(String[] args) {
        String str= "Java Guzeldir." ;
        System.out.println(str.substring(1,3));  //av
                                            //1 baslangic dahil inclusive
                                            //3 bitis haric exclusive

        System.out.println(str.substring(5,10)); // Guzel

        System.out.println(str.substring(0,12));  //Java Guzeldi

        // son 3 karakter haric tum metni yazdiralim
        System.out.println(str.substring(0,str.length()-3));

        System.out.println(str.substring(3,3));  // hiclik
       //sadece 4. index'deki harfi yazdiralim
        System.out.println(str.substring(2,3));
        System.out.println(str.substring(5,6));
        System.out.println(str.substring(0,2));
        System.out.println(str.substring(3));
     }
}
