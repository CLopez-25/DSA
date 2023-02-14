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
//        both values have been set to be equal ^^
    }

        //  ^^Nested class in case we want to put it in its own class file inside linkedList package from a permissions standpoint.^^
//    two variables = value and next. value is an integer and next is of type node which means that this variable can point to a node. similar to pointers where we had a variable of type hash map.
        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
    /////////////                 End of exercise                       /////////////////////////////////////


    public void printList(){
        Node temp = head;
        while (temp != null) {       // while loop prints out temp.value and then temp = temp.next will cause temp to start moving across the linked list until temp is null, then it will stop.
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
//  ^^  DID NOT DO INT BECAUSE WE WANT TO ACTUALLY PRINT THE LENGTH OUT SO IT'S BEEN FORMATTED LIKE THE OTHER TWO GETTERS^^

}


        // Node = An individual part of a larger data structure //