public class Question3 {
    public static void main(String[] args) {
        char a[] = new char[26];
        int n = 3, k = 25;
        char t = 'a';
        for(int l = 0; l < a.length; l++){
            a[l] = t++;
        }
        int i = a.length - 1;
        StringBuilder str = new StringBuilder("");
        while(k > 0 && n > 0){
            if((i + n) <= k){
                str.insert(0, a[i]);
                k -= (i + 1);
                n--;
            }else
                i--;
        }
        System.out.print(str);
    }
}