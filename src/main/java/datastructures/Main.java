package datastructures;

public class Main {

    // the constant is being dropped therefor this is example of 0(n):
//    public static void printItems(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//
//        for (int j = 0; j < n; j++) {
//            System.out.println(j);
//        }
//    }

    //  the following is an example of 0(n^2): purpose of quotes is so that it returns a string instead of adding the integers (i/j) together
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

// Big O: is time complexity vs space complexity of an algorithm or data structure
// code 1 can be faster than code 2 in terms of time complexity but code 2 can be more efficient in terms of space complexity
// if you can simplify your code to be 0(n^2) it will be much faster than 0(n^3)