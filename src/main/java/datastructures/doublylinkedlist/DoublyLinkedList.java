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
    public void append(int value) {     // return type is void because we dont need to return anything to be able to append an item to the linked list.
        Node newNode = new Node(value);
        if ( length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    // end of append method ///

    // removeLast method:
    public Node removeLast(){
        if (length == 0) return null;   // when the doubly linked list has 0 items in it
        Node temp = tail;
        if (length == 1){               // when the doubly linked list has 1 item in it
            head = null;
            tail = null;
        } else {                        // when the doubly linked list has 2 or more items in it
            tail = tail.prev;
            tail.next = null;
            temp.next = null;
        }
        length--;                       // decrement the list by 1
        return temp;                    // returning the Node
    }
    /// end of removeLast method ///

    //prepend method:
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    // end of prepend method ///

    // removeFirst method:
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    // end of removeFirst ///

}
