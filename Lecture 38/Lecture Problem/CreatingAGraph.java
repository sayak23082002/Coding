import java.util.ArrayList;

public class CreatingAGraph{
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
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[4];
        for(int k = 0; k < 4; k++){
            graph[k] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 0));
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));
        graph[1].add(new Edge(1, 3, 0));
        graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, 0));
        for(int k = 0; k < 4; k++){
            for(int l = 0; l < graph[k].size(); l++){
                Edge e = graph[k].get(l);
                System.out.print(e.source + ", " + e.destination + ", " + e.weight + ". ");
            }
            System.out.println();
        }
    }
}