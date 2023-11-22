public class Knapsack_0_1_Memoization {
    static int knapsack(int val[], int wei[], int cap, int i, int dp[][]){
        if(i >= val.length || cap <= 0){
            return 0;
        }
        if(dp[i][cap] != -1){
            return dp[i][cap];
        }
        if(wei[i] <= cap){
            int adding = val[i] + knapsack(val, wei, (cap - wei[i]), i + 1, dp);
            int notAdding = knapsack(val, wei, cap, i + 1, dp);
            dp[i][cap] = Math.max(adding, notAdding);
            return dp[i][cap];
        }else{
            dp[i][cap] = knapsack(val, wei, cap, i + 1, dp);
            return dp[i][cap];
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int val[] = {10, 15, 12, 30, 5};
        int wei[] = {5, 15, 2, 9, 4};
        int cap = 15;
        int dp[][] = new int[n + 1][cap + 1];
        for(int k = 0; k < dp.length; k++){
            for(int l = 0; l < dp[0].length; l++){
                dp[k][l] = -1;
            }
        }
        int profit = knapsack(val, wei, cap, 0, dp);
        System.out.println(profit);
    }    
}