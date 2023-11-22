public class FindingPOWOptimized {
    static int optimizedPOW(int n, int i) {
        if(i == 0)
            return 1;
        int half = optimizedPOW(n, (i / 2)) * optimizedPOW(n, (i / 2));;
        if((i % 2) != 0)
            half = n * half;
        return half;
    }
    public static void main(String[] args) {
        int n = 3, i = 3;
        System.out.println("The number is: " + optimizedPOW(n, i));
    } 
}
