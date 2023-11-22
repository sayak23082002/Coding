public class Findsum {
    static int findsum(int n){
        if (n == 0)
            return 0;
        if (n > 0)
            n += findsum(n - 1);
        return n;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The sum is: " + findsum(n) );
    }
}
