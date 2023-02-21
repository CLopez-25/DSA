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
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);         // created doubly linked list with the value of 1
//
//        myDLL.append(2);                                          // appended a node with the value of 2
//
//        myDLL.printList();                                    // printed doubly linked list
        // end of append exercise ///



        // removeLast exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);     // created doubly linked list with the value of 1
//        myDLL.append(2);                                      // appended a node with the value of 2
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myDLL.removeLast().value);
//
//        // (1) Item - Return 1 Node                           // returning the values of nodes 1 and 2
//        System.out.println(myDLL.removeLast().value);
//
//        // (0) Items - Return null
//        System.out.println(myDLL.removeLast());        // did not add .value to this because we know it is supposed to return null. .value would give us an error
        // end of removeLast exercise ///



        // prepend exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(3);
//
//        myDLL.prepend(1);
//
//        myDLL.printList();
        // end of prepend exercise ///



        // removeFirst exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(1);
//
//        //(2) Items - Returns 2 Node
//        System.out.println(myDLL.removeFirst().value);
//
//        // (1) Item - Return 1 Node
//        System.out.println(myDLL.removeFirst().value);
//
//        // (0) Items - Return null
//        System.out.println(myDLL.removeFirst());
        // end of removeFirst exercise ///



        // get exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(0);
//        myDLL.append(1);
//        myDLL.append(2);
//        myDLL.append(3);
//
//        System.out.println(myDLL.get(1).value);
//        System.out.println(myDLL.get(2).value + "\n");
//
//        myDLL.printList();
        // end of get exercise ///



        // set exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(11);
//        myDLL.append(3);
//        myDLL.append(23);
//        myDLL.append(7);
//
//        myDLL.set(1, 4);
//
//        myDLL.printList();
        // end of set exercise ///



        // insert exercise:
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(3);
//
//        myDLL.insert(1, 2);
//
//        myDLL.printList();
        // end of insert exercise ///



        // remove exercise;
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);

        myDLL.remove(1);

        myDLL.printList();
        // end of remove exercise ///

    }

}
