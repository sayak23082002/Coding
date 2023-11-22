import java.util.*;
/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to calculate the average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average is: " + ((a+b+c)/3));
        sc.close();
    }
}