public class Unbounded_Knapsack_Tabulation {
    public static void main(String[] args) {
        int n = 5;
        int val[] = {15, 14, 10, 45, 30};
        int wei[] = {2, 5, 1, 3, 4};
        int cap = 7;
        int dp[][] = new int[n + 1][cap + 1];
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i < n + 1; i++){
            for(int w = 1; w < cap + 1; w++){
                if(wei[i - 1] <= w){
                    dp[i][w] = Math.max(val[i - 1] + dp[i] [w - wei[i - 1]], dp[i - 1] [w]);
                }else{
                    dp[i][w] = dp[i - 1] [w];
                }
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }
}