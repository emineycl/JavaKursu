package day04_Concatenation;

public class C02_BasitIfCumleleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a * b > 100) {
            System.out.println("Carpimlari 100'den buyuk");  //OK

        }

        if (a < b) System.out.println("a b'den kucuk");  //OK

        //if sartindan sonra sadece bir satir kod yazacaksak suslu parantez kullanmasak da olur

        if (b > 0) {
            System.out.println("b 0'dan buyuk"); //OK
        }

        /* Basit if cumleleri kodun geri kalani ilgilenmez.
        dolayisiyla tum basit if cumlelerinin body'leri calisacabilecegi gibi
        hicbiri calismayabilir

         */


        boolean c = true;
        if (c) {
            System.out.println("c li if calisti");
        }

        String str = "java";
        c = a * 5 > b * 3;
        if (c) {
            System.out.println("2.c'li if calisti");}
    }
}

