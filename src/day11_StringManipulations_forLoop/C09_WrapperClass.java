package day11_StringManipulations_forLoop;

public class C09_WrapperClass {
    public static void main(String[] args) {
          /*
          String non-primitive oldugundan bircok faydali hazir method'u oldugunu gorduk
          primitive data turlerinin hazir method'lari olmaz
​
          java bu eksikligi gidermek icin
          primitive data turlerinin herbirine ozel Wrapper Class hazirlamistir
          Bu class'larda o data turu icin kullanabiloecegimiz bazi hazir methodlar olusturulmustur
         */

        String str="Java muhtesem";
        int sayi = 10;
        Integer sayiW=20;
        System.out.println(Integer.MAX_VALUE);  //2147483647
        System.out.println(Integer.max(34,465));


        boolean kontrol=true;
        Boolean kont=false;
        String knt="false";
        boolean sonuc =Boolean.valueOf(knt);

        char chr='*';
        Character ch='p';
        System.out.println(Character.MAX_VALUE);  //￿
        System.out.println(Character.getType('a'));  //12
        System.out.println(Character.isAlphabetic('9'));
    }
}
