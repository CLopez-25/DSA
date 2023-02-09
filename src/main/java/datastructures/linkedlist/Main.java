package datastructures.linkedlist;

// linkedList constructor:
public class Main {

    public static void main(String[] args) {

//        this is creating a new linked list. variable "mylinkedist is of type linked list which means it can point to a linked list.
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

    }

}
