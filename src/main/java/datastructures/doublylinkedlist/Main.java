package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

        // constructor exercise
//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        myDLL.printList();

        // end of constructor exercise

        //append exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//
//        myDLL.append(2);
//
//        myDLL.printList();
        // end of append exercise ///

        // removeLast exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myDLL.removeLast().value);
//
//        // (1) Item - Return 1 Node
//        System.out.println(myDLL.removeLast().value);
//
//        // (0) Items - Return null
//        System.out.println(myDLL.removeLast());
        // end of removeLast exercise ///

        // prepend exercise:
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);

        myDLL.prepend(1);

        myDLL.printList();
        // end of prepend exercise ///

    }

}
