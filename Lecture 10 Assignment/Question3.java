import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n; i > 0; i--)
            fact *= i;
        System.out.println("Factorial is: " + fact);
        sc.close();
    }
}
