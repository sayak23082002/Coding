import java.util.ArrayList;

public class BipartiteByCycle {
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

    public static boolean cycleExists(ArrayList<Edge>[] graph, int i, boolean[] visited){
        //O(V+E)
        int pos[] = new int[graph.length];
        for(int k = 0; k < graph.length; k++){
            if(!visited[k]){
                if(cycleExistsUtil(graph, k, -1, visited, pos)){
                    return true;
                }
            }
        }
        return false;
    }

    public static int position = 0, cycleLength = 0;

    public static boolean cycleExistsUtil(ArrayList<Edge>[] graph, int i, int parent, boolean visited[], int[] pos){
        visited[i] = true;
        pos[i] = ++position;
        for(int k = 0; k < graph[i].size(); k++){
            Edge e = graph[i].get(k);
            if(!visited[e.destination]){
                if(cycleExistsUtil(graph, e.destination, i, visited, pos)){
                    return true;
                }
            }
            else if(visited[e.destination] && e.destination != parent){
                cycleLength = pos[i] - pos[e.destination] + 1;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        boolean visited[] = new boolean[7];
        for(int k = 0; k < 7; k++){
            graph[k] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));
        // graph[0].add(new Edge(0, 3, 0));
        // graph[0].add(new Edge(0, 3, 0));
        // graph[0].add(new Edge(0, 4, 0));
        
        graph[1].add(new Edge(1, 0, 0));
        // graph[1].add(new Edge(0, 2, 0));
        graph[1].add(new Edge(0, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        // graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 4, 0));

        // graph[3].add(new Edge(3, 0, 0));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        // graph[4].add(new Edge(4, 0, 0));
        // graph[4].add(new Edge(4, 3, 0));

        cycleExists(graph, 0, visited);
        
        if(cycleLength == 0 || cycleLength % 2 == 0)
            System.out.print("This is a Bipartite graph.");
        else
            System.out.print("This is not a Bipartite graph.");
    }
}
