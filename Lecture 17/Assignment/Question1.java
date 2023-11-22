import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int k = 0; k <= (str.length() - 1); k++){
            char ch = str.charAt(k);
            if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u')
                count++;
        }
        System.out.println("Number of vowles: " + count);
        sc.close();
    } 
}