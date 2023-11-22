public class Factorial {
    static int find_factorial(int n){
        if (n == 0)
            return 1;
        if (n > 0)
            n *= find_factorial(n -1);
        return n;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The factorial is: " + find_factorial(n) );
    }
}
