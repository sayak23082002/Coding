public class TilingProblem {
    static int numberOfTiles(int n) {
        if(n == 0 || n == 1)
            return 1;
        int ver = numberOfTiles(n - 1); //verticle
        int hori = numberOfTiles(n - 2); //horizontal
        int total = ver + hori;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(numberOfTiles(3));
    }
}
