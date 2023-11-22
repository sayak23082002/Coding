import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        
        LinkedList<Character> ll = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');

        int i = 0, j = ll.size() - 1;

        

        stack.push(ll.get(0));

    }
    
}