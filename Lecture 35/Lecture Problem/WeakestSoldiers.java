import java.util.PriorityQueue;

public class WeakestSoldiers {
    static class Row implements Comparable<Row>{
        int numberOfSoldires;
        int index;
        Row(int numberOfSoldires, int index){
            this.numberOfSoldires = numberOfSoldires;
            this.index = index;
        }
        @Override
        public int compareTo(Row s2){
            if(this.numberOfSoldires == s2.numberOfSoldires)
                return s2.index - this.index;
            return s2.numberOfSoldires - this.numberOfSoldires;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        pq.add(new Row(1, 1));
        pq.add(new Row(4, 2));
        pq.add(new Row(1, 3));
        pq.add(new Row(1, 4));
        while(!pq.isEmpty()){
            System.out.print(pq.remove().index + " ");
        }
    }
}
