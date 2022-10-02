package day19_arrays;

import java.util.Arrays;

public class C14_ArraySiralamaMethodlari {
    public static void main(String[] args) {
        //verilen bir String array'i natural order ve ters siralama yapip bize donduren 2 method olusturun

        String[] arr ={"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};
        arr= naturalSirala(arr);
        System.out.println(Arrays.toString(arr));

        arr=tersNaturelSirala(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static String[] tersNaturelSirala(String[] arr) {
        Arrays.sort(arr);
        String[] tersSirali=new  String[arr.length];
        for (int i = 0; i <arr.length ; i++) {

            tersSirali[i]=arr[arr.length-i-1];

        }
        return tersSirali;
    }

    private static String[] naturalSirala(String[] arr) {
         Arrays.sort(arr);
         return arr;
    }
}
