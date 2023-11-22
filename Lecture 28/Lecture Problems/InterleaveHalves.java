import java.util.LinkedList;
import java.util.Queue;

public class InterleaveHalves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int size = q.size();
        Queue<Integer> sample = new LinkedList<>();

        for(int k = 0; k < (size / 2); k++){
            sample.add(q.remove());
        }
        
        while(!sample.isEmpty()){
            q.add(sample.remove());
            q.add(q.remove());
        }

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
