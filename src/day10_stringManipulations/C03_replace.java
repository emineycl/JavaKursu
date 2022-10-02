package day10_stringManipulations;

public class C03_replace {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";

        System.out.println(str.replace('J', 'j'));  //java ogren,isi kap

        System.out.println(str);  //Java ogren, isi kap
        str=str.replace("isi", "offer'i");
        //String'deki degisikligin kalici olmasi icin atama yapmaliyiz

        System.out.println(str);  //Java ogren, offer'i kap


        System.out.println(str.replace("a","e")); //Jeve ogren, offer'i kap
        // replace method'u sarta uyan tum parcalari degistirir

        System.out.println(str.replace("ogren","k")); //Java k, offer'i kap
        System.out.println(str.replace("a","aaaa"));  //Jaaaavaaaa ogren , offer'i kaaaap

        //tum a'lari silmek istiyorum
        System.out.println(str.replace("a",""));  //Jv ogren ,offer'i kp

        //olmayan bir metni degistirmek istersek
        System.out.println(str.replace("Kemal","Ali"));  //Java ogren,offer'i kap



    }
}
