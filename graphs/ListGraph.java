package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGraph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    ListGraph(int v) {
        V = v;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int src, int dest) {
        if (src >= 0 && src < V && dest >= 0 && dest < V) {
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        } else {
            System.out.println("Invalid vertices");
        }
    }

    void printList() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "'s neighbour vertices are ==> ");
            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        ListGraph graph = new ListGraph(v);

        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            graph.addEdge(sc.nextInt(), sc.nextInt());
        }

        graph.printList();
    }
}
