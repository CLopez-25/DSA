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
    // if there is an indication of a loop, figure out if it's a while loop or a for loop
    // if you know how many steps you're going to iterate through, it's a for loop.
    // if you don't then it's a while loop
    // pointer variable will be called temp and it'll be set to be equal to root

    // in an empty tree scenario you'll set the root to be equal to the new node, i.e.:
    // create newNode
    // if root == null then root == newNode

    // you cant insert a value that is already in the binary search tree

    //

}
