import java.util.*;
public class Question2 {
    public static boolean isEven(int n) {
        if(n%2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check odd or even: ");
        int n = sc.nextInt();
        if(isEven(n))
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}