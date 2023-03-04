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

    }
    // end of add edge method

}
