package day19_arrays;

import java.util.Arrays;

public class C02_ElementleriArtirma {
    public static void main(String[] args) {

        //  Soru 1- Verilen bir int array’in tum elemanlarini istenen bir deger kadar artirip
        //  bize donduren bir method olusturun.
        //  Eski array’i yeni haliyle kaydedin.

        int[] arr={2,4,6,8};
        int artisMiktari= 3;



      /*
       int[] yeniArray=elementeleriArtir(arr,artisMiktari);


        System.out.println("Yeni array : "Arrays.toString(yeniArray));

        arr=yeniArray;  //eski degere yeni atamayi yapti. yani kalici degisiklik oldu*

        System.out.println("Eski array : "+Arrays.toString(arr));
       */

        arr=elementeleriArtir(arr,artisMiktari);  //yukaridaki paragrafi bu sekilde daha kisa bir yolla yapabiliriz.*
        System.out.println("Eski array : "+Arrays.toString(arr));

    }
    public static int[] elementeleriArtir(int[] arr, int artisMiktari) {
        for (int i = 0; i <arr.length ; i++) {

            //arr[i]=arr[i] + artisMiktari;
        arr[i] +=artisMiktari;
        }
        return arr;
    }
}
