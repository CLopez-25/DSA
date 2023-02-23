package datastructures.stack;

public class Main {                             // main method

    public static void main(String[] args) {
        // first section of stack

//        Stack myStack = new Stack(4);     // creating a new stack
//
//        myStack.getTop();
//        myStack.getHeight();                    // getting the top and height values of the stack
//
//        myStack.printStack();                   // prints out the stack using the printStack method
        // end of first section of stack ///

        // push section:
//        Stack myStack = new Stack(2);     // created new stack with a node with the value of 2
//
//        myStack.push(1);                  // pushed a node with the value of 1 to the stack
//
//        myStack.printStack();                   // prints out the stack using the printStack method
        // end of push section ///

        // pop section:
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);               // created a new stack with nodes with the values of 7, 23, 3, 11

        myStack.pop();                     // popping the last item in the stack (11)

        myStack.printStack();            // prints out the stack using the printStack method
        // end of pop section ///

    }

}
