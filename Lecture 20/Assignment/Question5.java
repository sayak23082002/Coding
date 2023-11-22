public class Question5 {
    static void towerOfHanoi(int n, String s, String h, String d) {
        if(n == 1) {
            System.out.println("Shift disk " + n + " from " + s + " to " + d);
            return;
        }
        towerOfHanoi(n - 1, s, d, h);
        System.out.println("Shift disk " + n + " from " + s + " to " + d);
        towerOfHanoi(n - 1, h, s, d);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
}
