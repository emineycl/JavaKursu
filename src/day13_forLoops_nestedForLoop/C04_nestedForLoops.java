package day13_forLoops_nestedForLoop;

public class C04_nestedForLoops {
    public static void main(String[] args) {

        /*
         icice (nested) iki loop varsa
         outer loop her deger alddiginda
         inner loop bastan sona bir kez calisir
         */
        for (int i=0; i<5 ; i++) {  //dis loop, outer loop
            for (int j=1; j<5;j++) { //ic loop, inner loop

                System.out.println(i*j + "");


            }
            System.out.println(""); //islem bittiginde alt satira gecmeyi yariyor ve islem basa dönuyor *
        }
    }
}
