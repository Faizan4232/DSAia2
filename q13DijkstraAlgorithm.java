/*Algorithm Steps
Initialization:
Create a distance array dist[] where dist[i] represents the shortest distance from the source node to node i.
Initialize dist[source] = 0 (distance from source to itself is 0).
Set dist[i] = ∞ (infinity) for all other nodes.
Use a Priority Queue (Min-Heap) to always pick the node with the smallest current distance.
Relaxation Process (Repeat until all nodes are processed):
Extract the node u with the smallest distance from the priority queue.
For each neighbor v of u:
Calculate a new distance: newDist = dist[u] + weight(u, v).
If newDist < dist[v], update dist[v] = newDist and add (v, newDist) to the priority queue.
Termination:
When the priority queue is empty, dist[] contains the shortest distances from the source to all nodes. */
import java.util.*;

public class q12DijkstraAlgorithm {

    static class Edge {

        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(source, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.destination;

            for (Edge edge : graph.get(u)) {
                int v = edge.destination;
                int weight = edge.weight;

                if (distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    pq.add(new Edge(v, distances[v]));
                }
            }
        }
        // Print the shortest distances
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    public static void main(String[] args) {
        int numVertices = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 1));
        graph.get(2).add(new Edge(1, 2));
        graph.get(2).add(new Edge(3, 5));
        graph.get(3).add(new Edge(4, 3));
        dijkstra(graph, 0);
    }
}
//TC=O((V + E) log V)
