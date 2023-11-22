import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public static class Edge{
        int source;
        int destination;
        int weight;
        public Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
    public static boolean checkBipartite(ArrayList<Edge>[] graph){
        int color[] = new int [graph.length];
        for(int k = 0; k < color.length; k++){
            color[k] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int k = 0; k < graph.length; k++){
            if(color[k] == -1){
                q.add(k);
                color[k] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int i = 0; i < graph[curr].size(); i++){
                        Edge e = graph[curr].get(i);
                        if(color[e.destination] == -1){
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.destination] = nextColor;
                            q.add(e.destination);
                        }else if(color[e.destination] == color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int k = 0; k < 7; k++){
            graph[k] = new ArrayList<>();
        }

        //graph 1 - non-bipartite

        // graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));

        // graph[1].add(new Edge(1, 0, 0));
        // graph[1].add(new Edge(1, 3, 0));

        // graph[2].add(new Edge(2, 0, 0));
        // graph[2].add(new Edge(2, 4, 0));

        // graph[3].add(new Edge(3, 1, 0));
        // graph[3].add(new Edge(3, 4, 0));

        // graph[4].add(new Edge(4, 2, 0));
        // graph[4].add(new Edge(4, 3, 0));

        //graph 2 - bipartite

        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, 0));

        System.out.print(checkBipartite(graph));
    }
}
