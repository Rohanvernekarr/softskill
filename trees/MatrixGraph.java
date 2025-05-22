import java.util.Scanner;


class MatrixGraph {
    int v;
    int adj[][];

    MatrixGraph(int v){
        this.v = v;
        adj = new int[v][v];
    }

    void addEdge( int src , int dest){
        if(src >=0 && src <v &&  dest >=0 && dest <v){
            adj[src][dest] = 1;
            adj[dest][src] = 1; 
        }
        else{
            System.out.println("Invalid edge");
        }
    }

    void printGraph(){
        for(int i = 0; i < v; i++){
            for(int j = 0; j < v; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        MatrixGraph g = new MatrixGraph(v);

        int e = sc.nextInt();
        for(int i = 0; i < e; i++){
            int src = sc.nextInt();
            int dest = sc.nextInt();
            g.addEdge(src, dest);
        }
        g.printGraph();

        sc.close();
    }

    
}
