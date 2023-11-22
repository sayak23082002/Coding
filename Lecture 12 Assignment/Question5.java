import java.util.*;
public class Question5 {
    public static int sum (int n) {
        int rev = 0;
        while(n > 0){
            int t = n % 10;
            rev = (rev * 10) + t;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to claculate the sum of digits: ");
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println("Sum is: " + n);
    }
}