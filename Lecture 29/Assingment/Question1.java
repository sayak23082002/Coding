public class Question1 {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int l = 0, r = 0, ans = 0;
        for(int k = 0; k < str.length(); k++){
            if(str.charAt(k) == 'L')
                l++;
            if(str.charAt(k) == 'R')
                r++;
            if(l == r)
                ans++;
        }
        System.out.print("Total substring is: " + ans);
    }
}