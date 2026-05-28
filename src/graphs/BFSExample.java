package graphs;

import java.util.Arrays;
import java.util.*;

public class BFSExample {
    public List<Integer> bfsTraversal(List<Integer>[] adj, int v) {
        ArrayList<Integer> bfsAnswer = new ArrayList<>();
        boolean[] visits  = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visits[0] = true;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfsAnswer.add(node);
            for (Integer it : adj[node]) {
                if (!visits[it]) {
                    visits[it] = true;
                    q.add(it);
                }
            }
        }
        return bfsAnswer;
    }

    public static void main(String[] args) {
        int V = 5;
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[0].addAll(Arrays.asList(1, 2));
        adj[1].addAll(Arrays.asList(0, 3));
        adj[2].addAll(Arrays.asList(0, 4));
        adj[3].add(1);
        adj[4].add(2);

        BFSExample sol = new BFSExample();

        List<Integer> result = sol.bfsTraversal(adj, V);

        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
