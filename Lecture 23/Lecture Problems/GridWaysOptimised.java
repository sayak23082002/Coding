public class GridWaysOptimised {
    static int factorial(int n){
        if(n == 1)
            return 1;
        int fact = n * factorial(n - 1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 5, m = 5;
        int total = factorial((n - 1) + (m - 1)) / (factorial(n - 1) * factorial(m - 1));
        System.out.println("Total number of ways: " + total);
    }
}
