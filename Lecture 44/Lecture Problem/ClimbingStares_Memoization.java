import java.util.Arrays;
public class ClimbingStares_Memoization {
    static long CalculatingStares(int n, long a[]){
        if(n == 0){
            a[n] = 1;
            return 1;
        }
        if(n < 0)
            return 0;
        if(a[n] != -1)
            return a[n];
        a[n] = CalculatingStares(n - 1, a) + CalculatingStares(n - 2, a);
        return a[n];
    }
    public static void main(String[] args) {
        int n = 545;
        long a[] = new long[n + 1];
        Arrays.fill(a, -1);
        System.out.print(CalculatingStares(n, a));
    }
}