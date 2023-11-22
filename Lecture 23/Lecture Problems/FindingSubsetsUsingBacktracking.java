public class FindingSubsetsUsingBacktracking {
    static void findSubString(String str, int i, String ans){
        if(i >= str.length()){
            if(ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }
            
            //yes decision

            findSubString(str, i + 1, (ans + str.charAt(i)));
            
            //no decision
            
            findSubString(str, i + 1, ans);

    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findSubString(str, 0, ans);
    }
}
