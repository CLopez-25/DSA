package datastructures.graph;

public class Main {

    public static void main(String[] args) {
//        Graph myGraph = new Graph();
//
//        myGraph.addVertex("A");
//
//        myGraph.printGraph();
        // end of addvertex

        // Add Edge
//        Graph myGraph = new Graph();
//
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//
//        myGraph.addEdge("A", "B");
//
//        myGraph.printGraph();
        // end of Add edge

        // remove edge:
//        Graph myGraph = new Graph();
//
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//        myGraph.addVertex("C");
//
//        myGraph.addEdge("A", "B");
//        myGraph.addEdge("A", "C");
//        myGraph.addEdge("B", "C");
//
//        myGraph.removeEdge("A", "B");
//
//        myGraph.printGraph();
        // end of remove edge

        // remove vertex:
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");

        myGraph.removeVertex("D");

        myGraph.printGraph();
        // end of remove vertex

    }
}
