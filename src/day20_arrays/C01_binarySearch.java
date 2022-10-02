package day20_arrays;

import day19_arrays.C04_ElementArama;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        //verilen bir arrayde istenen elementin
        //olup olmadigini kontrol etme

        String[] arr ={"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};
        String arananElement="Gursel" ;

        C04_ElementArama.elemanVarMi(arr,arananElement);

        //Javada da arama methodu vardir

        System.out.println(Arrays.binarySearch(arr, arananElement));  //-7

        C04_ElementArama.elemanVarMi(arr,"Dalyan");   //Aradiginiz element array'de 1 defa kullanilmis
        System.out.println(Arrays.binarySearch(arr,"Dalyan"));   //3

        /*
        Binary Search bir array'de bir elementin oldugu index'i verir
        ancak öncelikle sort yapilmalidir.

        sort yapilmadan binary search ile arama yapilirsa sonucun ne olacagini bilemeyiz
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        C04_ElementArama.elemanVarMi(arr,"Esra");  //Aradiginiz element array'de 1 defa kullanilmis
        System.out.println(Arrays.binarySearch(arr, "Esra"));  //3

        /*
        array'de olmayan bir element aranirsa
        önce o element array'de olsa kacinci SIRADA olacagini bulur
         basina - yazarak olmadigini bize soyler
         */

        //[Bora, Dalyan ,Esra , Fatih ,Jacob, Muhammet, Naci]
        System.out.println(Arrays.binarySearch(arr,"Gursel"));  //-5
        System.out.println(Arrays.binarySearch(arr,"Sukran"));   //-8
        System.out.println(Arrays.binarySearch(arr,"Ahmet"));   //-1
    }
}
