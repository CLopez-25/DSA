package misc.interview1;

public class Main {

    // item in common:
    public static boolean itemInCommon(int[] array1, int[] array2) {
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) return true;
            }
        }
        return false;
    }
}
