/*Algorithm:
Step-by-step
Initialize graph
Create an ArrayList of ArrayList<Integer> to represent the adjacency list.
Loop i = 0 to vertices-1 and initialize an empty list for each vertex.
Add Edges
For each edge (u, v), do:
Add v to u's list
Add u to v's list (since it's undirected)
Print the Graph
For each vertex i, print all nodes in graph[i]. */
import java.util.*;

public class q10SimpleGraph {

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Node " + i + ": ");
            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        printGraph(graph);
    }
}//TC=O(V+E)
