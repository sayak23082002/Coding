import java.util.Stack;

public class Question3 {

    public static String decode(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder s = new StringBuilder("");
        int len = str.length();
        for(int k = 0; k < len; k++){
            if(str.charAt(k) != ']'){
                stack.push(str.charAt(k));
                continue;
            }
            while(stack.peek() != '[')
                s.insert(0, stack.pop());
            stack.pop();
            int n = Character.getNumericValue(stack.pop());
            StringBuilder t = new StringBuilder(s);
            for(int l = 1; l < n; l++){
                s.append(t);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str = new String("3[b2[v]]L");
        str = decode(str);
        System.out.println("Decoded String is: " + str);
    }
}