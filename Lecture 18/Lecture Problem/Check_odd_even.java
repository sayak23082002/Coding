public class Check_odd_even {
    static void checkOddEven(int n) {
        if((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        checkOddEven(3);
        checkOddEven(10);
        checkOddEven(4);
        checkOddEven(7);
    }
}