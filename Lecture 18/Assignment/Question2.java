public class Question2 {
    public static void main(String[] args) {
        int x = 10, y = 4;
        System.out.println("Before swapping: " + x + ", " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swapping: " + x + ", " + y);
    }
}
