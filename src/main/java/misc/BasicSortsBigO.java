package misc;

public class BasicSortsBigO {

    /*

  Big O insertion sort notes:

     Since insertion sort has a for loop inside of a for loop, it is O(n^2) | O of n squared |
     in it's worst case.

     if something is almost sorted you basically just make one pass through a loop.
     (that would be n complexity not n squared.)

     quick sort and merge sort methods are more efficient because they are O(n * logn), they
     are more complex to write, but they are faster.

     except when you have almost sorted data, you can use an insertion algorithm that is more
     primitive because it is O(n^2) typically and it will actually run faster.

  Quiz Notes:

  Bubble, Selection, and Insertion Sort all have loops within loops,
  so they are O(n^2) in time complexity.

  Bubble, Selection, and Insertion Sort have O(1) space complexity. all sort the array in place
  so that means they don't create additional copies of the array.

  Only Insertion Sort is O(n) if you start with a sorted (or almost sorted) array!!

     */

}
