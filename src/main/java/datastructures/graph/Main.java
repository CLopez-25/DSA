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
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");

        myGraph.addEdge("A", "B");

        myGraph.printGraph();
        // end of Add edge

    }
}
