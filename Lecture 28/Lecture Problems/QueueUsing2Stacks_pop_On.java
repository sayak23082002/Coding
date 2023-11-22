import java.util.Stack;
public class QueueUsing2Stacks_pop_On {
    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();
    public boolean isEmpty(){
        return stack1.isEmpty();
    }
    public void add(int n){
        stack1.push(n);
    }
    public int remove(){
        if(stack1.isEmpty()){
            System.out.println("The Queue is empty.");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int t = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return t;
    }
    public static void main(String[] args) {
        QueueUsing2Stacks_pop_On q = new QueueUsing2Stacks_pop_On();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
