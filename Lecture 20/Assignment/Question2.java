public class Question2 {
    static String s[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static void printInNumber(int n) {
        if(n != 0){
            printInNumber((n / 10));
            int t = n % 10;
            System.out.print(s[t] + " ");
        }
    }
    public static void main(String[] args) {
        printInNumber(2019);
    }
}