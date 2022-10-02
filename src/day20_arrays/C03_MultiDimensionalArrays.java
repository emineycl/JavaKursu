package day20_arrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr={2,3,4};

        int[] [] mda={{1,2,3}, {3,4},{4,2,5,6}};

        /*
          Bu array'de ic ice 2 kat var
        outer array'i dusunursek  int[] = { mda[0], mda[1], mda[2]}
         */

        System.out.println(mda.length);  //3
        System.out.println(mda[0].length);  //3
        System.out.println(mda[1].length);  //2

        //en bastaki 1 elementini yazdiralim

        System.out.println(mda[0][0]);  //1

        //2. 4 yazdiralim

        System.out.println(mda[2][0]);  //4

        //5'in degeri 9 yapalim

        mda[2][0]=9;

        //mda'yi yazdiralim
        //{{1,2,3}, {3,4},{4,2,5,6}}


        System.out.println(Arrays.toString(mda));  //[[I@3ac3fd8b, [I@5594a1b5, [I@6a5fc7f7]

        // multi dimensional array'lerde tek toString() ise yaramaz
        // ya tek tek ic array'leri yazdirabliriz

        System.out.println(Arrays.toString(mda[2]));  //{4,2,9,6}

        //veya tum mda'yi yazdirmak istersek

        System.out.println(Arrays.deepToString(mda));  //[[1, 2, 3], [3, 4], [9, 2, 5, 6]]
    }
}
