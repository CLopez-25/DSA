package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    // rcontains method:
    private boolean rContains(Node currentNode, int value){
        if (currentNode == null) return false;

        if (currentNode.value == value) return true;

        if (value < currentNode.value){
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }
    // end of rcontains method ///

    // rInsert method:
    private Node rInsert(Node currentNode, int value){
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }
    // end of rInsert method ///

    // deleteNode method:
    private Node deleteNode(Node currentNode, int value){
        if (currentNode == null) return null;                               // if the value we're looking for is not in the tree, we're going to return null.

        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);         // this section is going to traverse left and right and either determine that the value we're looking for is in the tree or not.
        } else {                                                              // if this else statement is triggered, there could be four possibilities:
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = null;                                             // 1. the node we're looking at is a leaf node, so we can just set it to null.
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;                               // 2. it could be a node that is open on the left and has a node on the right.
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;                                // 3. it could be a node that is open on the right and has a node on the left.
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);  // 4. or it could have a node on the left AND on the right.
            }
        }
        return currentNode;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }                                       // this is the overloaded method that is public and will be called from the main method.
    // end of deleteNode method ///

    //minValue method:
    public int minValue(Node currentNode){
        while (currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    //end of minValue method ///

    // breadth first search methods:

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while(queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

}
