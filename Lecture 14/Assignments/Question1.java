import java.util.*;
public class Question1 {
    public static boolean repeat(int rev[]){
        int l = rev.length - 1;
        for(int i = 0; i <= l; i++){
            for(int j = (i + 1); j <= l; j++){
                if(rev[i] == rev[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int repeat[] = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++)
            repeat[i] = sc.nextInt();
        System.out.println("Repetation: " + repeat(repeat));
        sc.close();
    }
}