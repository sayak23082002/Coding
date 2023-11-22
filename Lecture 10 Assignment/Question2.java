import java.util.*;

/**
 * Question2
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0, oddSum = 0, n;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n % 2 == 0)
                evenSum += n;
            else
                oddSum += n;
        }
        System.out.println("Even Sum: " + evenSum + " Odd Sum: " + oddSum);
        sc.close();
    }
}