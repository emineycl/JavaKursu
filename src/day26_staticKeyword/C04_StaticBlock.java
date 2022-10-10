package day26_staticKeyword;

public class C04_StaticBlock {
    static  int sayi;
    C04_StaticBlock() {
        System.out.println("Constructor calisti");
    }
    static {
        System.out.println("static blok calisti");
        sayi=40;
    }

    public static void main(String[] args) {
        C04_StaticBlock obj1=new C04_StaticBlock();
        System.out.println("sayi :" +sayi);

        //1-Java main methodu calistirmadan önce static block'u calistirir
        //2-static block calisti yazsini görururuz
        //3-sayi degerine 40 atamasiyapilir
        //4-main method calisir
        //5-obje olusturulur
        //6-constructor calisir
        //sayi degeri calisir //iki tane main method olmaz ama static method olur  ***min***
        //* Static block'lar tum class uyelerinden, main method'an bile once calisir
    }
}
