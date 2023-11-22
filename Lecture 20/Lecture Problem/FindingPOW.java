public class FindingPOW {
    static int pow(int n, int i) {
        if(i == 0)
            return 1;
        return n * pow(n, (i - 1));
    }
    public static void main(String[] args) {
        int n = 5, i = 4;
        System.out.println("The number is: " + pow(n, i));
    }    
}