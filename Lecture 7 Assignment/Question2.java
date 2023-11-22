import java.util.*;

class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        int s = sc.nextInt();
        System.out.println("The area is: " + (s*s));
        sc.close();
    }
}