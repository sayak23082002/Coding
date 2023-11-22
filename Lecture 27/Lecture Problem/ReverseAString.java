import java.util.*;

public class ReverseAString {

    public static String reverseString(Stack<Character> s){

        StringBuilder str = new StringBuilder("");

        while(!s.isEmpty()){

            str.append(s.pop());

        }

        return str.toString();

    }

    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();

        String str = new String("Hello");

        int i = 0;

        while(i < str.length()){

            s.push(str.charAt(i));

            i++;

        }

        str = reverseString(s);

        System.out.println(str);

    }
}
