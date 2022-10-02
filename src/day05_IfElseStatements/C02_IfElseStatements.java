package day05_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {

        //   Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef
        //  kaldin” yazdirin.
        /*
        Eger if ile yazdigimiz bir kodda sadece iki ihtimal varsa bu durumda if-else cumleleri kullaniriz

        tanimdan da anlayacaginiz uzere sadece iki ihtimal vardir. ve sadece ikisinden biri calisir
        ikisinin birden calisma ihtimali ---- yoktur
        hic birinin calismamasi ihtimali--- yoktur
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50) {
            System.out.println("Sinifi gevtin");

        } else  {
            System.out.println("Maalesef kaldin");
        }

    }
}
