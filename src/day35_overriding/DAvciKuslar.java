package day35_overriding;

public class DAvciKuslar extends BKuslar{

    String tur="Kumes kusu";
    String isim="Kumes kusu Isim belirtilmedi";
    String ayak="Kumes kuslari kumeste yasar";
    String enSevdikleriYiyecek="Yaban tavsani";

    void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }
    void pence(){
        System.out.println("Avci kuslarin penceleri vardir");
    }
    void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }
}
