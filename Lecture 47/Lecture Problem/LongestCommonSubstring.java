public class LongestCommonSubstring{
    static int usingTabulation(String s1, String s2, int l1, int l2){
        int dp[][] = new int[l1 + 1][l2 + 1];
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i <= l1; i++){
            for(int j = 1; j < l2; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcde"; 
        String str2 = "abgce";
        int l1 = str1.length();
        int l2 = str2.length();
        System.out.print(usingTabulation(str1, str2, l1, l2));
    }
}