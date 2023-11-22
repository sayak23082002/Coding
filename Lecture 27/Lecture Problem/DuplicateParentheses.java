import java.util.*;

public class DuplicateParentheses {

    public static boolean DuplicatePair(String str){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            
            char c = str.charAt(i);
    
            if(c == ')'){

                int count = 0;

                while(stack.pop() != '('){

                    count++;

                }

                if(count == 0){

                    return true;

                }

            }else{

                stack.push(c);

            }

        } 

        return false;

    }
    
    public static void main(String[] args) {
        
        String str = "(((a+b)+(c+d)))";

        System.out.println(DuplicatePair(str));

    }

}