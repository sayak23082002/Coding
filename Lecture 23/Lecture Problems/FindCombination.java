public class FindCombination {
    static void findCombinations(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i <= str.length() - 1; i++){
            String newString = str.substring(0, i) + str.substring(i + 1);
            findCombinations(newString, ans + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findCombinations(str, "");
    }
}