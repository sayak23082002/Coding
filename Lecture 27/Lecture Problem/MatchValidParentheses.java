import java.util.*;

public class MatchValidParentheses {
    
    public static boolean ValidatePairs(String str){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            
            char c = str.charAt(i);
    
            if(c == '(' || c == '{' || c == '['){
    
                stack.push(c);
    
            }else{

                if(stack.isEmpty()){

                    return false;

                }
    
                if((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') ||(c == ']' && stack.peek() == '[')){
    
                    stack.pop();
    
                }else{
    
                    return false;
    
                }
    
            }
        
        }

        if(stack.isEmpty())

            return true;

        return false;

    }
    
    public static void main(String[] args) {
        
        String str = "({{[]{}}()})";

        System.out.println(ValidatePairs(str));

    }

}
