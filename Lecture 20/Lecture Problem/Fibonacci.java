public class Fibonacci {
    static int NthfibonacciNumber(int n) {
        if(n == 1)
            return 0;
        else{
            if(n == 2)
                return 1;
            else
                return NthfibonacciNumber(n - 1) + NthfibonacciNumber(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The nth number is: " + NthfibonacciNumber(n));
    }
}