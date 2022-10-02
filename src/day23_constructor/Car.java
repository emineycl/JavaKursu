package day23_constructor;

public class Car {

    int ilanNO;

    String marka="deger atanmadi";
    String model="deger atanmadi";
    int yil;
    int fiyat;

    public void maxHiz(String yakit) {

        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli araclar icin max hiz 240 km/h");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel araclar icin max hiz 260 km/h");

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("Elektrikli araclar icin max hiz 200 km/h");

        } else {
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }

    @Override
    public String toString() {
        return
                "ilanNO=" + ilanNO +
                        ", marka :" + marka +
                        ", model :" + model +
                        ", yil :" + yil +
                        ", fiyat :" + fiyat ;
    }

    public Car(int ilanNO, String marka, String model, int yil, int fiyat) {
        this.ilanNO = ilanNO;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }
    public Car(){

    }

    public void vites(String yakit) {

        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli araclar otomatik veya duz vites olabilir");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel araclar otomatik veya duz vites olabilir");

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("Elektrikli araclar otomatik veya duz vites olabilir");

        } else {
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }
}
