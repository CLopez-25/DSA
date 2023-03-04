package misc.interview1;

import java.util.HashMap;

public class Main {

    // item in common(example 1):
//    public static boolean itemInCommon(int[] array1, int[] array2) {
//        for (int i : array1) {
//            for (int j : array2) {
//                if (i == j) return true;
//            }
//        }
//        return false;                           // this block of code(6-13) is inefficient because it has nested for loops!!
//    }                                           // O(n^2)

    // item in common(example 2):
    public static  boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1){
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
    }

}
