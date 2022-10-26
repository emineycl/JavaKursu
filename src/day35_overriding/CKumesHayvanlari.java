package day35_overriding;

public class CKumesHayvanlari extends BKuslar{

    String tur="Kumes kusu";
    String isim="Kumes kusu Isim belirtilmedi";
    String ayak="Kumes kuslari kumeste yasar";

    void hareket(){
        System.out.println("Kumes hayvanlari yurur");
    }
    void beslenme(){
        System.out.println("Kumes hayvanlari et veya ot yerler");
    }
}
