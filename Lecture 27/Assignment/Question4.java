import java.util.Stack;

public class Question4 {
    public static int findInLeft(int a[], int i){
        Stack<Integer> stack = new Stack<>();
        for(int k = 0; k < i; k++){
            if(stack.isEmpty() || a[stack.peek()] < a[k])
                stack.push(k);
        }
        if(stack.isEmpty() || a[stack.peek()] < a[i])
            return i;
        return stack.peek();
    }
    public static int findInRight(int a[], int i){
        Stack<Integer> stack = new Stack<>();
        for(int k = (i + 1); k < a.length; k++){
            if(stack.isEmpty() || a[stack.peek()] < a[k])
                stack.push(k);
        }
        if(stack.isEmpty() || a[stack.peek()] < a[i])
            return i;
        return stack.peek();
    }
    public static int heightArray(int a[]){
        int totalHeight = 0;
        for(int k = 0; k < a.length; k++){
            int minHeight = Math.min(a[findInLeft(a, k)], a[findInRight(a, k)]);
            int actualHeight = minHeight - a[k];
            totalHeight += actualHeight;
        }
        return totalHeight;
    }
    public static void main(String[] args) {
        int a[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(heightArray(a));
    }
}
