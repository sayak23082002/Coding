import java.util.Queue;
import java.util.LinkedList;
public class StackUsing2Queues_push_On {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }
    public void push(int n){
        if(queue1.isEmpty()){
            queue1.add(n);
            while(!queue2.isEmpty()){
                queue1.add(queue2.remove());
            }
            return;
        }
        queue1.add(n);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
    }
    public int pop(){
        int t = 0;
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        if(queue1.isEmpty())
            t = queue1.remove();
        else
            t = queue2.remove();
        return t;
    }
    public static void main(String[] args) {
        StackUsing2Queues_pop_On s = new StackUsing2Queues_pop_On();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}
