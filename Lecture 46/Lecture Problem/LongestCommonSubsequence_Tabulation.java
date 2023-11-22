public class LongestCommonSubsequence_Tabulation {
    public static void main(String[] args) {
        String s1 = "abcdge";
        String s2 = "abedg";
        int l1 = s1.length();
        int l2 = s2.length();
        int dp[][] = new int[l1 + 1][l2 + 1];
        for(int i = 0; i < l1 + 1; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i < l2 + 1; i++){
            dp[0][i] = 0;
        }
        for(int i = 1; i < l1 + 1; i++){
            for(int j = 1; j < l2 + 1; j++){
                //include
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.print(dp[l1][l2]);
    }
}