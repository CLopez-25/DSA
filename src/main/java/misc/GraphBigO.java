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

}
