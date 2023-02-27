package datastructures.binarysearchtree;

public class BinarySearchTree {

    Node root;      // not private because we wanna have access so we have visibility to it

    class Node{
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

}
