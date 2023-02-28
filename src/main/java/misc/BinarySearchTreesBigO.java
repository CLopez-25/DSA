package misc;

public class BinarySearchTreesBigO {

    // binary search trees are more efficient when using lookup() and remove() because of O(log n)
    // linked lists are not because you'd have to iterate through all indexes or reindex items in the list
    // comparisons apply to array lists as well
    // linked lists and binary search trees are both dynamic sized data structures


    // in an unsorted array list if you add an item to the end its just O(1) so it's better than a binary search tree
    // but if you were looking up or removing by value, not by index, it would be O(n)
    // each node has to have a pointer pointing to it or its\'s going to get garbage collected

    // notes for insert in binary search tree:

    // create newNode
    // if less than go left,  else greater than go right
    // if null insert newNode else move to next
    //

}
