import java.util.*;

public class StackSpanProblem {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        int a[] = { 100, 80, 60, 70, 60, 85, 100 };

        int s[] = new int[a.length];

        s[0] = 1;

        int i = 1;

        while (i < a.length) {

            if (stack.isEmpty()) {

                s[i] = i + 1;

                stack.push(i);

                i++;

            } else {

                int p = stack.peek();

                if (a[i] < a[p]) {

                    s[i] = i - p;

                    stack.push(i);

                    i++;

                } else {

                    stack.pop();

                }
            }

        }

        for (int k = 0; k < s.length; k++) {

            System.out.print(s[k] + " ");

        }

    }

}