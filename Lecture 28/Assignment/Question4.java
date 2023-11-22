import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int k = 3;
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        Stack<Integer> stack = new Stack<>();
        for(int l = 0; l < k; l++)
            stack.push(queue.remove());
        Queue<Integer> solution = new LinkedList<>();
        while(!stack.isEmpty())
            solution.add(stack.pop());
        while(!queue.isEmpty())
            solution.add(queue.remove());
        System.out.println(solution);
    }
}