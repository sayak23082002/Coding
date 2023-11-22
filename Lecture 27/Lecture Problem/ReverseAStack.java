import java.util.*;

public class ReverseAStack {

    public static void pushAtBottom(Stack<Integer> s, int n){

        if(s.isEmpty()){

            s.push(n);

            return;

        }

        int d = s.pop();

        pushAtBottom(s, n);

        s.push(d);

    }

    public static void revesreStack(Stack<Integer> s){

        if(s.isEmpty()){

            return;

        }

        int n = s.pop();

        revesreStack(s);

        pushAtBottom(s, n);

    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
    
        s.push(1);
        s.push(2);
        s.push(3);

        revesreStack(s);

        while(!s.isEmpty()){

            System.out.println(s.pop());

        }

    }

}
