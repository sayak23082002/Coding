import java.util.ArrayList;

public class CheckCycleDirected {
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
    public static boolean dfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int k = 0; k < graph.length; k++){
            if(!visited[k]){
                if(dfsUtil(graph, visited, stack, k)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfsUtil(ArrayList<Edge>[] graph, boolean[] visited, boolean[] stack, int curr){
        visited[curr] = true;
        stack[curr] = true;
        for(int k = 0; k < graph[curr].size(); k++){
            Edge e = graph[curr].get(k);
            if(stack[e.destination]){
                return true;
            }
            if(!visited[e.destination] && dfsUtil(graph, visited, stack, e.destination)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];
        for(int k = 0; k < 7; k++){
            graph[k] = new ArrayList<>();
        }
        
        //graph 1 - false
        // graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));

        // graph[1].add(new Edge(1, 3, 0));

        // graph[2].add(new Edge(2, 3, 0));

        //graph 2 - true
        graph[0].add(new Edge(0, 2, 0));
        
        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 0, 0));
        
        System.out.print(dfs(graph));
    }
}
