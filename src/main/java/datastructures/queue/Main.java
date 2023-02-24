package datastructures.queue;

public class Main {

    public static void main(String[] args) {

//        Queue myQueue = new Queue(7);       // creating a queue
//
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        myQueue.printQueue();
        // end of first section in queue ///

        // enqueue section:
//        Queue myQueue = new Queue(1);
//
//        myQueue.enqueue(2);
//
//        myQueue.printQueue();
        // end of enqueue section ///

        // dequeue section:
        Queue myQueue = new Queue(2);

        myQueue.enqueue(1);

        // (2) Items - Returns 2 Nodes
        System.out.println(myQueue.dequeue().value);

        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);

        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());
        // end of dequeue section

    }

}

// pushing an item into a queue is O(1)
// removing an item from a queue is O(1)
// it is common to implement a Stack with an Array List