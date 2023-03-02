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

    // insert method:
    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    // end of insert method ///

    // contains method:
    public boolean contains(int value){         // see notes for explanation on how this method works
        Node temp = root;
        while (temp != null){
            if (value < temp.value){
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
    // end of contains method ///

}
