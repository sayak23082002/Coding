import java.util.*;
class Question1 {
    static void fastExpo(int a) {
        int ans = 1, n = a;
        while (n > 0) {
            if((n & 1) != 0)
                ans *= a;
            a *= a;
            n = n >> 1;
        }
        System.out.println("The answer is: " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x : ");
        int a = sc.nextInt();
        fastExpo(a);
        sc.close();
    }
}