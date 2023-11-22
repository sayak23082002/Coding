import java.util.PriorityQueue;

public class CombiningRoaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> ropes = new PriorityQueue<>();
        ropes.add(3);
        ropes.add(2);
        ropes.add(3);
        ropes.add(4);
        ropes.add(6);
        int cost = 0;
        while(ropes.size() > 1){
            int r1 = ropes.remove();
            int r2 = ropes.remove();
            int sum = r1 + r2;
            cost += sum;
            ropes.add(sum);
        }
        System.out.print(cost);
    }
}
