public class LongestCommonSubsequence_Memoization {
    public static int findSubsequence(String s1, String s2, int l1, int l2, int dp[][]){
        //base case
        if(l1 == 0 || l2 == 0){
            return 0;
        }
        if(dp[l1 - 1][l2 - 1] != -1){
            return dp[l1 - 1][l2 - 1];
        }
        if(s1.charAt(l1 - 1) == s2.charAt(l2 - 1)){//for same
            return dp[l1 - 1][l2 - 1] = (findSubsequence(s1, s2, l1 - 1, l2 - 1, dp) + 1);
        }else{//for different
            int ans1 = findSubsequence(s1, s2, l1 - 1, l2, dp);
            int ans2 = findSubsequence(s1, s2, l1, l2 - 1, dp);
            return dp[l1 - 1][l2 - 1] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String s1 = "abcdge";
        String s2 = "abedg";
        int l1 = s1.length();
        int l2 = s2.length();
        int dp[][] = new int[l1][l2];
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                dp[i][j] = -1;
            }
        }
        System.out.print(findSubsequence(s1, s2, l1, l2, dp));
    }
}