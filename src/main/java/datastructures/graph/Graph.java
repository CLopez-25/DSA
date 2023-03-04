package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }

    // Add vertex method:
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
    // end of add vertex method

    // add edge method:
    public boolean addEdge(String vertex1, String vertex2){
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {       // if both vertices exist
            adjList.get(vertex1).add(vertex2);                                   // add the edge between the two vertices
            adjList.get(vertex2).add(vertex1);                                   // add the edge between the two vertices
            return true;                                                         // return true if the edge was added
        }
        return false;                                                           // return false if the edge was not added
    }
    // end of add edge method

    // remove edge method:
    public boolean removeEdge(String vertex1, String vertex2){
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {         // if both vertices exist
            adjList.get(vertex1).remove(vertex2);                                   // remove the edge between the two vertices
            adjList.get(vertex2).remove(vertex1);                                   // remove the edge between the two vertices
            return true;                                                            // return true if the edge was removed
        }
        return false;                                                           // return false if the edge was not removed
    }
    // end of remove edge method

}
