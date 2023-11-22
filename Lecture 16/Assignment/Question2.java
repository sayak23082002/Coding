public class Question2 {
    public static void main(String[] args) {
        int m[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } }, sum = 0;
        for (int k = 0; k <= (m[0].length - 1); k++) {
            sum += m[1][k];
        }
        System.out.println("Sum is: " + sum);
    }
}