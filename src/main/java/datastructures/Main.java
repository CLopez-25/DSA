package datastructures;

public class Main {

    //    n + n = 2n or 0(2n)
    // the constant(2) is being dropped therefor this is example of 0(n):
//    public static void printItems(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//
//        for (int j = 0; j < n; j++) {
//            System.out.println(j);
//        }
//    }

    //  the following is an example of 0(n^2): purpose of quotes is so that it returns a string instead of adding the integers (int i/ int j) together
//    public static void printItems(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
//    }

    // the following is an example of 0(n^3) three levels deep now
//    public static void printItems(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                    System.out.println(i + " " + j + " " + k);
//                }
//            }
//        }
//    }

    // if you can simplify your code to be 0(n^2) it will be much faster than 0(n^3)
    public static void printItems(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }

}

// Big 0: is time complexity vs space complexity of an algorithm or data structure that produces the same output for a given input.
// code 1 can be faster than code 2 in terms of time complexity but code 2 can be more efficient in terms of space complexity
// if you can simplify your code to be 0(n^2) it will be much faster than 0(n^3)

// 0(1) is the most efficient Big 0: from what we've seen so far, as n grows, the number of operations grows. in this example, the number of operations stays constant.

// 0(log n) is the second most efficient Big 0.

// some sorting algorithms use 0(n log n) with quick sort and merge sort.

