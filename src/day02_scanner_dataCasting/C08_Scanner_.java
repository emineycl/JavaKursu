package day02_scanner_dataCasting;

import java.util.Scanner;

public class C08_Scanner_ {
    public static void main(String[] args) {

        /* Kullanicidan bir cemberin yaricapini alip , cevresini ve alanini yazdirin.

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Bir cemberin yaricapini yaziniz");
                Double yaricapr= scan.nextDouble();

                System.out.println("cemberin cevre uzunlugu:"+ 2*3.14*yaricapr);
                System.out.println("Cemberin alani:" +3.14*yaricapr*yaricapr );

    }
}
