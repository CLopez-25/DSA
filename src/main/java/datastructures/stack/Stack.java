package datastructures.stack;

public class Stack {                // stack class

    private Node top;               // two variables for stack
    private int height;

    class Node{                     // node creating class
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value){                // stack constructor
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){               // method to print out our stack in main
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

}
