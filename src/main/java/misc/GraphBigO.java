package misc;

public class GraphBigO {

    // for space complexity, the ADJACENCY MATRIX is O of the number of vertices squared. O(|V|^2)
    // ADJACENCY LIST is O of the number of vertices plus the number of edges. O(|V|+|E|)
    // so from a space complexity, the adjacency list is better.

    // ADDING a vertex is just a matter of adding to the end of the list in an adjacency list,
    // whereas in an adjacency matrix you have to add a row and a column. it is stored in a two-dimensional array,
    // as soon as you make those arrays bigger, you have to create new arrays that are bigger, which is inefficient.

    // FROM A BIG O perspective, ADJACENCY MATRIX is O(|V|^2) every time you add a vertex,
    // whereas with an ADJACENCY LIST it's O(1) to ADD a vertex!
    //
//    {
//        "A"=["B", "E"],
//        "B"=["A", "C", "F"],
//        "C"=["B", "D"],
//        "D"=["C", "E"],
//        "E"=["A", "D"],
//        "F"=["B"]
//    }
    // IN THIS EXAMPLE WE'RE ADDING AND EDGE BETWEEN B AND THE NEW VERTEX F. (ADJACENCY LIST)
    // in adjacency matrix we changed the 0 to a 1 on the row and column of F and B.
    // both cases are now O(1)

    // REMOVE:
    // with ADJACENCY LIST in order to remove the F edge we have to iterate through each array list and find where F is and then remove it,
    // then go to F array list and do the same thing
    // with an ADJACENCY MATRIX in order to remove that same edge you just change the 1 to a 0 in the F and B columns and it is removed.
    // in this situation the adjacency matrix outperforms the adjacency list,
    // ADJACENCY MATRIX is O(1) and the ADJACENCY LIST is O(|E|).


}
