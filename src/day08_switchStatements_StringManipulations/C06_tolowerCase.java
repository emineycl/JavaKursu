package day08_switchStatements_StringManipulations;

import java.util.Locale;

public class C06_tolowerCase {
    public static void main(String[] args) {

        // String'i istedigimiz sekilde buyuk harf veya kucuk harfe cevirebiliriz

        String str= "Java candir" ;
        System.out.println(str.toUpperCase());  //JAVA CANDIR //str.toUpperCase tamamini buyuk harfle yazdirmaya yarar
        System.out.println(str);  //Java Candir
    str=str.toUpperCase();
        System.out.println(str); //JAVA CANDIR
        System.out.println(str.toLowerCase()); //java candir

        //eger buyuk kucuk harf cevirirken , bir dile göre yapmak isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));  // java candir

        str=str.toLowerCase(); //java candir


        System.out.println(str.toLowerCase((Locale.forLanguageTag("Tr")))); //JAVA CANDİR


    }
}
