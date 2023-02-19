package datastructures.doublylinkedlist;


public class DoublyLinkedList {

    // constructor exercise:
    private Node head;
    private Node tail;
    private int length;

    class Node {                 //  whenever a method needs to create a node it will call this class to create it
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;     // both values have been set to be equal ^^
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {       // while loop prints out temp.value and then
            System.out.println(temp.value);     //temp = temp.next will cause temp to start moving across the linked list until temp is null, then it will stop.
            temp = temp.next;
        }
    }

    //    Getters for head, tail, and length.
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
//  ^^  DID NOT DO INT BECAUSE WE WANT TO ACTUALLY PRINT THE LENGTH OUT SO IT'S BEEN FORMATTED LIKE THE OTHER TWO GETTERS^^
    // end of constructor exercise //

    // append method:

    // end of append method ///

}
