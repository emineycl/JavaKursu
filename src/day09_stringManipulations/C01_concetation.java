package day09_stringManipulations;

public class C01_concetation {
    public static void main(String[] args) {
        String a= "Java";
        String b="Guzeldir";
        String c="";
        String d=" ";

        int s= 5;
        int t= 4;

        //Sadece yukaridaki veriable'lari kullanarak
        //Java Guzeldir 9 yazdiralim

        System.out.println(a+d+b+d+s+t);  //Java Guzeldir 54
        System.out.println(a+d+b+d+(s+t));

        /*
        String method'lari icerisinde + islemi yerine kullanilabilecek concat() vardir.

         */
        System.out.println(a.concat(b));   //JavaGuzeldir
        System.out.println(a.concat(d).concat(b).concat(d).concat(s+t+c));  //Java Guzeldir 9


    }
}
