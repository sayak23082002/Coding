import java.util.LinkedList;
import java.util.Queue;
public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        int ch[] = new int[26];
        String str = new String("aabccxb");
        for(int k = 0; k < str.length(); k++){
            char c = str.charAt(k);
            ch[c - 'a']++;
            q.add(c);
            while(!q.isEmpty() && ch[q.peek() - 'a'] != 1)
                q.remove();
            if(q.isEmpty()){
                System.out.println("First non-repeating character: -1");
                continue;
            }
            System.out.println("First non-repeating character: " + q.peek());
        }
    }
}
