import java.util.*;

public class NextGreterElement {
    
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        int a[] = {3, 5, 4, 4, 3, 1, 3, 2};

        int s[] = new int[a.length];

        s[0] = 1;

        int i = a.length - 1;

        while (i >= 0) {

            if (stack.isEmpty()) {

                s[i] = -1;

                stack.push(i);

                i--;

            } else {

                int p = stack.peek();

                if (a[i] <= a[p]) {

                    s[i] = a[p];

                    stack.push(i);

                    i--;

                } else {

                    stack.pop();

                }
            }

        }

        for (int k = 0; k < s.length; k++) {

            if(s[k] == -1)
                System.out.print(k + " ");

        }

    }

}