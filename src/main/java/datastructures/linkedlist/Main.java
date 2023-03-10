package datastructures.linkedlist;

// linkedList constructor:
public class Main {

    public static void main(String[] args) {

        // constructor exercise solution
        // this is creating a new linked list. variable myLinkedList is of type linked list which means it can point to a linked list.
//        LinkedList myLinkedList = new LinkedList(4);  // creating our new linked list with a node with a value of 4.

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
        // end of constructor exercise ///

        // append exercise solution
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.makeEmpty();           // empties the list
//        myLinkedList.append(1);             // appends the new node value with a value of 1
//        myLinkedList.append(2);             // appends the new node value with a value of 2

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
        // end of append solution ///

        // removeLast exercise solution
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);                           // creating a linked list with nodes with the value of one and two.
//
//        // (2) Items - Returns 2 Nodes
//        System.out.println(myLinkedList.removeLast().value);    // adding .value returns the node with the value of 2
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);    // adding .value returns the node with the value of 1
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());  // we don't need to add .value because we know it should return null (null pointer exception if .value is added)
        // end of removeLast solution ///

        // prepend solution
//        LinkedList myLinkedList = new LinkedList(2);   // created linked list with nodes with the values of 2 and 3
//        myLinkedList.append(3);
//
//        myLinkedList.prepend(1);                    // prepended a node with the value of 1 to the beginning of the linked list
//
//        myLinkedList.printList();                       // prints out the linked list
        // end of prepend solution ///

        // removeFirst solution:
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//
//        // (2) Items - Returns 2 Nodes
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());
        // end of removeFirst solution ///

        // Get solution:
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);                                 // created linked list with nodes with values of 1-3
//
//        System.out.println(myLinkedList.get(2).value + "\n");  // prints out the node at the index value of 2
//
//        myLinkedList.printList();                           // prints out entire linked list with the node still in the list
        // end of get solution ///

        // Set solution:
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.set(1, 4);
//
//        myLinkedList.printList();
        // end of Set solution ///

        // insert solution:
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(2);
//
//        myLinkedList.insert(1, 1);
//
//        myLinkedList.printList();
        // end of insert solution ///

        // remove solution:
//        LinkedList myLinkedList = new LinkedList(11);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.remove(2);
//
//        myLinkedList.printList();
        // end of remove solution ///

        // reverse constructor:
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.reverse();

        myLinkedList.printList();
        // end of reverse solution ///
    }

}

// removing the last item from a linked list is O(n) because you have to start at the beginning of th list and iterate through to the end
// removing the first item from a linked list is O(1) because you have to reindex every other item once the first item is removed.
// finding an item by index in a linked list is O(n) because you have to iterate through the list until you get to the index you're looking for