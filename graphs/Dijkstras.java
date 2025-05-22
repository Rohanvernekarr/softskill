import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijkstras {
    public static void main(String[] args) {

        Map<Integer,ArrayList<int[]>> adjList;

        //object
        Dijkstras d = new Dijkstras();
        d.addEdge(0,4,15);
        d.addEdge(0,2,2);
        d.addEdge(2,4,10);
        d.addEdge(2,1,15);
        d.addEdge(2,3,20);
        d.addEdge(1,4,16);
        d.addEdge(3,4,14);
    }

    Dijkstras(){
        adjList = new HashMap<>();
    }
    void addEdge(int src,int dest ,int e){
        adjList.put(src, new ArrayList<>());
        adjList.get(src).add(new int[] {dest,weight});
        adjList.put(dest, new ArrayList<>());
        adjList.get(dest).add(new int[] {src,weight});

    }
    void solve(int start){
        HashMap<Integer,Integer> dest = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[1]));
        for (int[] is : pq) {
            dist.put(vertex[0],Integer.MAX_VALUE);
            pq.add(new int[] {vertex[0],Integer.MAX_VALUE}); 
        }



    }
    
    
}
