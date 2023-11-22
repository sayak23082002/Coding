public class Question2 {
    static void findCombination(String c[], int digit, StringBuffer str){
        if(digit == 0 || digit == 1){
            System.out.println(str);
            return;
        }
        int n = digit % 10 - 1;
        for(int k = 0; k <= c[n].length() - 1; k++){
            int temp = digit;
            findCombination(c, temp / 10, str.insert(0, c[n].charAt(k)));
            str.deleteCharAt(0);
        }
    }
    public static void main(String[] args) {
        String comb[] = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = 234;
        StringBuffer str = new StringBuffer("");
        findCombination(comb, digit, str);
    }
}
