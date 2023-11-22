import java.util.*;
public class Question3 {
    public static int reverse (int n) {
        int rev = 0;
        while(n > 0){
            int t = n % 10;
            rev = (rev * 10) + t;
            n = n / 10;
        }
        return rev;
    }
    public static boolean isPalindrom (int n){
        int rev = reverse(n);
        if(n == rev)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ot check for palindrom: ");
        int n = sc.nextInt();
        if(isPalindrom(n))
            System.out.println("Palindrom");
        else
            System.out.println("Not Palindrom");
        sc.close(); 
    }
}