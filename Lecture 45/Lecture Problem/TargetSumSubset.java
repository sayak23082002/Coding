public class TargetSumSubset {
    public static void main(String[] args) {
        int n = 5;
        int num[] = {4, 2, 7, 1, 3};
        int target = 10;
        boolean dp[][] = new boolean[n + 1][target + 1];
        for(int k = 0; k < dp.length; k++)
            dp[k][0] = true;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if((num[i - 1] <= j) && dp[i - 1][j - num[i - 1]]){
                    dp[i][j] = true;
                }
                else if(dp[i - 1][j]){
                    dp[i][j] = true;
                }
            }
        }
        System.out.println(dp[n][target]);
    }
}