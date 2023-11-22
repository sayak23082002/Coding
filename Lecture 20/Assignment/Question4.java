public class Question4 {
    static int findSubstring(String s, int st, int en, int n) {
        if(n == 1)
            return 1;
        if(n <= 0)
            return 0;
        int count = findSubstring(s, st, en - 1, n - 1) + findSubstring(s, st + 1, en, n - 1) - findSubstring(s, st + 1, en - 1, n - 2);
        if(s.charAt(st) == s.charAt(en))
            count++;
        return count;
    }
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(findSubstring(s, 0, s.length() - 1, s.length()));
    }
}
