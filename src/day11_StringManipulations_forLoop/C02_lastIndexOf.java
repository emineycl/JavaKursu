package day11_StringManipulations_forLoop;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String str="Java cok guzel, cok";
        System.out.println(str.indexOf("cok"));  //5  //aranilan kelimeyi bastan arar
        System.out.println(str.lastIndexOf("cok"));   //16  //aramaya sondan basliyor ama indexi her zaman bastan yapar

        System.out.println(str.indexOf("o"));  //6

        System.out.println(str.lastIndexOf("o"));   //17

        System.out.println(str.indexOf("cok,10"));   //16
        //10. index ve sonrasinda arama yapar

        System.out.println(str.lastIndexOf("cok",10));  //5
        /*
          Kullanicidan bir cumle ve bir kelime isteyin
          cumlede kelimenin kullanimina gore
          asagidaki cumlelerden uygun olani yazdirin
          - cumle aradiginiz kelimeyi icermiyor
          - aradiginiz kelime cumlede sadece 1 tane var
          - aradiginiz kelime cumlede birden fazla var
         */

        String arananKelime="cok";
        int ilkIndex=str.indexOf(arananKelime);
        int sonIndex= str.lastIndexOf(arananKelime);

        if (!str.contains(arananKelime)) {
            System.out.println("cumle aradiginiz kelimeyi icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("Aradiginiz kelime sadece 1 tane var");
        } else {
            System.out.println("Aradiginiz kelime cumlede birden fazla var");

        }

    }
}
