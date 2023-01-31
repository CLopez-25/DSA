package datastructures;

public class Main {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }

}

// Big O: is time complexity vs space complexity of an algorithm or data structure
// code 1 can be faster than code 2 in terms of time complexity but code 2 can be more efficient in terms of space complexity
//