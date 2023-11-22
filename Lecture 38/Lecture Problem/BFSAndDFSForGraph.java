import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAndDFSForGraph {
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

    public static void bfs(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[7];
        for(int k = 0; k < graph.length; k++){
            if(!visited[k])
                bfsUtil(graph, visited);
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited){
        //O(N)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.println(curr);
                visited[curr] = true;
                for(int l = 0; l < graph[curr].size(); l++){
                    Edge e = graph[curr].get(l);
                    q.add(e.destination);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int i, boolean[] visited){
        for(int k = 0; k < graph.length; k++){
            if(!visited[k])
                dfsUtil(graph, i, visited);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int i, boolean visited[]){
        //O(V+E)
        System.out.print(i + " ");
        visited[i] = true;
        for(int k = 0; k < graph[i].size(); k++){
            Edge e = graph[i].get(k);
            if(!visited[e.destination]){
                dfsUtil(graph, e.destination, visited);
            }
        }
    }

    public static boolean hashPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        //O(V+E)
        if(src == dest)
            return true;
        visited[src] = true;
        for(int k = 0; k < graph[src].size(); k++){
            Edge e = graph[src].get(k);
            if(!visited[e.destination] && hashPath(graph, e.destination, dest, visited)){
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

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, 0));
        graph[3].add(new Edge(3, 5, 0));

        graph[4].add(new Edge(4, 2, 0));
        graph[4].add(new Edge(4, 3, 0));
        graph[4].add(new Edge(4, 5, 0));

        graph[5].add(new Edge(5, 3, 0));
        graph[5].add(new Edge(5, 4, 0));
        graph[5].add(new Edge(5, 6, 0));

        graph[6].add(new Edge(6, 5, 0));
        
        bfs(graph);

        System.out.println();

        dfs(graph, 0, visited);

        System.out.println();

        visited = new boolean[7];

        System.out.println(hashPath(graph, 0, 6, visited));
    }
}
