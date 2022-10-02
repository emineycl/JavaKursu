package day03_matematikselislemler_Increment;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {


        int a= 10;

        a++;
        System.out.println(a); //11

        ++a;
        System.out.println(a); //12

        //yeni bir veriable olusturun a'nin degerini yeni variable'a atayin
        //sonra a'nin degerini bir artrin

        int b= a;
        a++;
        System.out.println("a'nin degeri : " +a+ ", b'nin degeri: " +b ); //a=13 b=12

        int c=a++;
        System.out.println("a'nin degeri : " +a+ ", c'nin degeri: " +c ); //c=13 a=14








    }
}
