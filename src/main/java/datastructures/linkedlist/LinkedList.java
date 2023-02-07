package datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

        //    Nested class below:   ////////////// in case we wanna put it in its own class file inside linkedlist package
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
        //    ///////////////////////////

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


}
