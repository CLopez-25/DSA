package datastructures.linkedlist;

public class LinkedList {

//    first exercise of course completed below: class variables, node class, and constructor in Main.
    private Node head;
    private Node tail;
    private int length;


        //    whenever a method needs to create a node it will call this class to create it
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

        //  ^^Nested class in case we want to put it in its own class file inside linkedList package.^^
    /////////////                 End of exercise                               /////////////////////////////////////

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
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
//  ^^  DID NOT DO INT BECAUSE WE WANT TO ACTUALLY PRINT THE LENGTH OUT SO IT'S BEEN FORMATTED LIKE SO^^

}
