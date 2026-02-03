package assignments.assignment4;

import java.util.*;

class Pair {
    int weight;
    int vertex;

    public Pair(int weight, int vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }
}

public class PrimsAlgorithm {

    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {
                {0, 1, 5},
                {1, 2, 3},
                {0, 2, 1}
        };

        PrimsAlgorithm obj = new PrimsAlgorithm();
        System.out.println(obj.spanningTree(V, edges));
    }

    public int spanningTree(int V, int[][] edges) {
        Map<Integer, List<Pair>> adjList = new HashMap<>();

        for (int i = 0; i < V; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            Pair pair = new Pair(w, u);
            adjList.get(v).add(pair);

            pair = new Pair(w, v);
            adjList.get(u).add(pair);
        }

        int totalCost = 0;
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.weight));
        Pair pair = new Pair(0, 0);
        pq.offer(pair);

        while (!pq.isEmpty()) {
            pair = pq.poll();
            int weight = pair.weight;
            int u = pair.vertex;

            if (visited[u]) continue;

            visited[u] = true;
            totalCost += weight;

            for (Pair w_v: adjList.get(u)) {
                int w = w_v.weight;
                int v = w_v.vertex;

                if (!visited[v]) {
                    Pair p = new Pair(w, v);
                    pq.offer(p);
                }

            }
        }

        for (boolean visit: visited) {
            if (!visit) return -1;
        }

        return totalCost;
    }
}
