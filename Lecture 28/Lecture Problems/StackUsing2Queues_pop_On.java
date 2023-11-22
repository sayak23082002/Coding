import java.util.Queue;
import java.util.LinkedList;
public class StackUsing2Queues_pop_On {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }
    public void push(int n){
        if(queue1.isEmpty()){
            queue2.add(n);
            return;
        }
        queue1.add(n);
    }
    public int pop(){
        int t = 0;
        if(queue2.isEmpty()){
            while(!queue1.isEmpty()){
                t = queue1.remove();
                if(queue1.isEmpty())
                    break;
                queue2.add(t);
            }
        }else{
            while(!queue2.isEmpty()){
                t = queue2.remove();
                if(queue2.isEmpty())
                    break;
                queue1.add(t);
            }
        }
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
