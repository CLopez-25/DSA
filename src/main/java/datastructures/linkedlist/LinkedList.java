package datastructures.linkedlist;

// Node = An individual part of a larger data structure //

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
    //      End of exercise  /////


    public void printList(){
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

    public void makeEmpty(){        // method to use for emptying the linked list
        head = null;
        tail = null;
        length = 0;
    }


        // append method:
    public void append(int value) {
        Node newNode = new Node(value);  // creates a new node
        if (length == 0) {              // this is if we have an empty linked list
            head = newNode;
            tail = newNode;
        } else {                        // this is if there are items in the link linked list
            tail.next = newNode;
            tail = newNode;
        }
        length++;                      // increasing the length by one
    }
        //// end of append exercise  ////

    // removeLast method:
    public Node removeLast(){
        if (length == 0) return null;   // if the linked list is equal to 0 we return null; this linked list has a length of 1.
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {     // while temp.next is not equal to null,
            pre = temp;                 // pre is set equal to temp in the first iteration of the while loop
            temp = temp.next;           // temp is set equal to temp.next in the next iteration until temp.next is null.
        }
        tail = pre;                     // once we are broken out of the while loop when temp.next is null, tail will be set equal to pre
        tail.next = null;               // tail.next is set equal to null to break out the last node from the end
        length--;                       // we are decrementing the length by one
        // below is our edge case for when we only have one node
        if (length == 0) {              // current line is same as beginning of the method but this is happening after we have decremented the length; this linked list has a length of 0.
            head = null;                // if the linked list is starting at 0 then head and tail has to equal null
            tail = null;
        }
        return temp;                    // all we have left to do is return that node
    }
        // end of remove last method  ///

    // prepend method:
    public void prepend(int value){
        Node newNode = new Node(value);  // creating a new node
        if (length == 0) {                  // if statement is for when there are no items in the linked list
            head = newNode;
            tail = newNode;             // head and tail will point to the new node
        } else {                        // else statement is for when there are items in the linked list
            newNode.next = head;
            head = newNode;             // the new node will be added to the beginning of the linked list and will now become the head
        }
        length++;                       // we will increase the linked list length by 1.
    }
        // end of prepend method ///


    // remove first method:
    public Node removeFirst(){
        if (length == 0) return null;   // the linked list started with one item in it
        Node temp = head;
        head = head.next;
        temp.next = null;               // this will break the first node off the linked list
        length--;                       // the linked list will be decremented by 1.
        if (length == 0){               // the linked list starts with 0 items in it. same situation as remove last method with their being two similar if statements.
            tail = null;
        }
        return temp;                    // temp is the pointer to the node that we just removed
    }
    // end of removeFirst method ///

    // Get method:
    public Node get(int index){
        if (index < 0 || index >= length) {
            return null;                        // wwe cannot get a node at the index of -1(index < 0) or greater than the length of our linked list(index >= length).
        }
        Node temp = head;                   // temp is the variable we are using to return the node and set it equal to head.
        for (int i = 0; i < index; i++){
            temp = temp.next;               // temp variable will be moved forward inside for loop by saying temp = temp.next
        }
        return temp;                        // once we reach the node at the index we want, we return temp.
    }
    // end of Get method ///

    // Set method:
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    // end of Set method ///

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
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    // end of insert method ///
}
