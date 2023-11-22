public class Knapsack_0_1_Tabulation {
    public static void main(String[] args) {
        int n = 5;
        int val[] = {10, 15, 12, 30, 5};
        int wei[] = {5, 15, 2, 9, 4};
        int cap = 15;
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
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1] [w - wei[i - 1]], dp[i - 1] [w]);
                }else{
                    dp[i][w] = dp[i - 1] [w];
                }
            }
        }
        System.out.println(dp[dp.length - 1][dp[0].length - 1]);
    }
}