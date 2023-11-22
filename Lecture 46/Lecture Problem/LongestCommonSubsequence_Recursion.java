public class LongestCommonSubsequence_Recursion {
    public static int findSubsequence(String s1, String s2, int l1, int l2){
        //base case
        if(l1 == 0 || l2 == 0){
            return 0;
        }
        if(s1.charAt(l1 - 1) == s2.charAt(l2 - 1)){//for same
            return (findSubsequence(s1, s2, l1 - 1, l2 - 1) + 1);
        }else{//for different
            int ans1 = findSubsequence(s1, s2, l1 - 1, l2);
            int ans2 = findSubsequence(s1, s2, l1, l2 - 1);
            return Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String s1 = "abcdge";
        String s2 = "abedg";
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.print(findSubsequence(s1, s2, l1, l2));
    }
}