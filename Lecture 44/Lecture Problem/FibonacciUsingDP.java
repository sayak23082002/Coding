public class FibonacciUsingDP{
    static int FibonacchiMemo(int n, int a[]){
        if(n == 0 || n == 1){
            a[n] = n;
            return n;
        }
        if(a[n] != 0){
            return a[n];
        }
        a[n] = FibonacchiMemo(n - 1, a) + FibonacchiMemo(n - 2, a);
        return a[n];
    }
    static int FibonacchiTab(int n){
        int a[] = new int[n + 1];
        a[0] = 0; a[1] = 1;
        for(int k = 2; k <= n; k++){
            a[k] = a[k - 1] + a[k - 2];
        }
        return a[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int a[] = new int[n + 1];
        System.out.println(FibonacchiMemo(n, a));
        System.out.print(FibonacchiTab(n));
    }
}