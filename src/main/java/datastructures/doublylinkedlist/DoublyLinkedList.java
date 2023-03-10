package datastructures.doublylinkedlist;


import datastructures.linkedlist.LinkedList;

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
    public void append(int value) {     // return type is void because we don't need to return anything to be able to append an item to the linked list.
        Node newNode = new Node(value);     // creates the new node
        if ( length == 0){                  // if statement to making sure that the linked list is empty. could also say if (head = null).
            head = newNode;
            tail = newNode;
        } else {                        // else statement for when there ARE items in the linked list.
            tail.next = newNode;
            newNode.prev = tail;        // we want the previous pointer to point to the same node that the tail is pointing to.
            tail = newNode;
        }
        length++;                       // increasing the length by 1.
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

    // Get method:
    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if (index < length/2){
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }
    // end of get method ///

    // set method:
    public boolean set(int index, int value){   // the code is almost exactly the same in doubly linked list as a linked list,
        Node temp = get(index);                 // but it differs in the get method since the get method runs differently in a doubly linked list.
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    // end of set method ///

    // insert method:
    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }
    // end of insert method ///

    // remove method:
    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();       // removeFirst also has return type of Node so we can use it here
        if (index == length - 1) return removeLast();   // removeLast also has return type of Node so we can use it here
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
    // end of remove method ///

}
