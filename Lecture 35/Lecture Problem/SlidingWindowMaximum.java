import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class Window implements Comparable<Window>{
        int value;
        int index;
        Window(int value, int index){
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(Window w2){
            return w2.value - this.value;
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7}, k = 3;
        int r[] = new int[a.length - k + 1];
        PriorityQueue<Window> pq = new PriorityQueue<>();
        for(int l = 0; l < k; l++)
            pq.add(new Window(a[l], l));
        r[0] = pq.peek().value;
        for(int i = k; i < a.length; i++){
            while(pq.size() > 0 && pq.peek().index <= (i - k)){
                pq.remove();
            }
            pq.add(new Window(a[i], i));
            r[i - k + 1] = pq.peek().value;
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }
}
