import java.util.ArrayList;
public class AddInMINHeap{
    public static class MINHeap{
        ArrayList<Integer> list = new ArrayList<>();
        void add(int t){
            list.add(t);
            int newIndex = list.size() - 1, i = (newIndex - 1) / 2;
            while(list.get(newIndex) < list.get(i)){
                int temp = list.get(newIndex);
                list.set(newIndex, list.get(i));
                list.set(i, temp);
                newIndex = i;
                i = (newIndex - 1) / 2;
            }
        }
        int peek(){
            return list.get(0);
        }
        void heapify(int i){
            int leftChild = (2 * i) + 1;
            int rightChild = (2 * i) + 2;
            int min = i;
            if(leftChild < list.size() && list.get(min) > list.get(leftChild)){
                min = leftChild;
            }
            if(rightChild < list.size() && list.get(min) > list.get(rightChild)){
                min = rightChild;
            }
            if(min != i){
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);

                heapify(min);
            }
        }
        int remove(){
            int data = list.get(0);
            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set((list.size() - 1), temp);
            list.remove(list.size() - 1);
            heapify(0);
            return data;
        }
        boolean isEmpty(){
            return list.size() == 0;
        }
    }
    public static void main(String[] args) {
        MINHeap heap = new MINHeap();
        heap.list.add(2);
        heap.list.add(3);
        heap.list.add(4);
        heap.list.add(5);
        heap.list.add(10);
        // heap.add(1);
        // System.out.println(heap.remove());
        // System.out.print(heap.list);
        while(!heap.isEmpty()){
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}