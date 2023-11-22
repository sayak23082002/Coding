public class RodCutting{
    public static void main(String[] args) {
        int n = 8;
        int p[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int v[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int dp[][] = new int[n + 1][n + 1];
        for(int i = 0; i < dp.length; i++)
            dp[i][0] = 0;
        for(int i = 0; i < dp[0].length; i++)
            dp[0][i] = 0;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(p[i - 1] <= j){
                    dp[i][j] = Math.max((v[i - 1] + dp[i][j - p[i - 1]]), dp[i - 1][j]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println("Max profit: " + dp[n][n]);
    }
}