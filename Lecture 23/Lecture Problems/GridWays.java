public class GridWays {
    static int gridWays(int n, int m){
        if(n == 1 && m == 1){
            return 1;
        }else{
            if(n <= 0 || m <= 0){
                return 0;
            }
        }
        int count = gridWays(n - 1, m) + gridWays(n, m - 1);
        return count;
    }
    public static void main(String[] args) {
        int n = 5, m = 5;
        System.out.println("Total number of ways: " + gridWays(n, m));
    }
}
