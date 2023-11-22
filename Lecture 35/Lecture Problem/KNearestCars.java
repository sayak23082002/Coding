import java.util.PriorityQueue;

public class KNearestCars {
    static class cars implements Comparable<cars>{
        String name;
        int xAxis;
        int yAxis;
        int distanceSqr = (xAxis * xAxis) + (yAxis * yAxis);
        cars(String name, int xAxis, int yAxis){
            this.name = name;
            this.xAxis = xAxis;
            this.yAxis = yAxis;
        }
        @Override
        public int compareTo(cars car){
            return this.distanceSqr - car.distanceSqr;
        }
    }
    public static void main(String[] args) {
        int k = 2;
        PriorityQueue<cars> q = new PriorityQueue<>();
        q.add(new cars("C0", 3, 3));
        q.add(new cars("C1", 5, -1));
        q.add(new cars("C2", -2, 4));
        for(int l = 1; l <= k; l++)
            System.out.print(q.remove().name + " ");
    }
}
