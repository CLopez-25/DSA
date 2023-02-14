package datastructures.linkedlist;

// linkedList constructor:
public class Main {

    public static void main(String[] args) {

//        this is creating a new linked list. variable mylinkedist is of type linked list which means it can point to a linked list.

        LinkedList myLinkedList = new LinkedList(4);  // creating our new linked list with a node with a value of 4 (value was from prev course section).

        myLinkedList.makeEmpty();           // empties the list
        myLinkedList.append(1);             // appends the new node value with a value of 1
        myLinkedList.append(2);             // appends the new node value with a value of 2

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();  // from prev section of dsa course

        System.out.println("\nLinked List:");
        myLinkedList.printList();

    }

}
