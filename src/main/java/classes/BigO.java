package classes;

public class BigO {

    //    n + n = 2n or O(2n)
    // the constant(2) is being dropped therefor this is example of O(n):
//    public static void printItems(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//
//        for (int j = 0; j < n; j++) {
//            System.out.println(j);
//        }
//    }

    //  the following is an example of O(n^2): purpose of quotes is so that it returns a string instead of adding the integers (int i/ int j) together
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

    // if you can simplify your code to be O(n^2) it will be much faster than O(n^3)
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

// Big O: is time complexity vs space complexity of an algorithm or data structure that produces the same output for a given input.
// Big O measure worst case scenario, not average case scenario.
// code 1 can be faster than code 2 in terms of time complexity but code 2 can be more efficient in terms of space complexity
// if you can simplify your code to be O(n^2) it will be much faster than O(n^3)

// O(1) is the most efficient Big O: from what we've seen so far, as n grows, the number of operations grows. in this example, the number of operations stays constant.

// O(log n) is the second most efficient Big O.

// some sorting algorithms use O(n log n) with quick sort and merge sort.

//          O(1)
// -adding/removing at the end of an array/array list (one operation for both)
// -looking for an item by index

//          O(n)
// -adding/removing at the beginning of an array/array list (everything has to be re-indexed)
// -looking for an item by value


//              OVERVIEW

//  ALL OF THESE ARE BASED ON TIME COMPLEXITY EFFICIENCY.

//  O(n^2) = loop within a loop
//  O(n) = proportional / straight line
//  O(log n) = divide and conquer
//  O(1) = constant time / most efficient

// those are the four most common big O's

// O(n!) is something you intentionally would have to write bad code in order to achieve.(in the horrible category)
// O(2^n) is next in the horrible category
// O(n^2) is after that
// O(n log n) is more efficient than the previous two but still bad. will be seen in some sorting algorithms.
// O(n) is more efficient than O(n log n) and in the fair category.
// O(log n) & 0(1) are the most efficient of the graph because they don't require as many operations.
