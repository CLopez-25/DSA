package datastructures.stack;

public class Main {                             // main method

    public static void main(String[] args) {

        Stack myStack = new Stack(4);     // creating a new stack

        myStack.getTop();
        myStack.getHeight();                    // getting the top and height values of the stack

        myStack.printStack();                   // prints out the stack using the printStack method

    }
}
