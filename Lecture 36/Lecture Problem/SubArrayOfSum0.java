import java.util.HashMap;

public class SubArrayOfSum0 {
    public static void main(String[] args) {
        int a[] = {15, -2, 2, -8, 1, 7, 10};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, len = 0;
        for(int k = 0; k < a.length; k++){
            sum += a[k];
            if(hm.containsKey(sum)){
                len = Math.max(len, (k - hm.get(sum)));
            }else{
                hm.put(sum, k);
            }
        }
        System.out.println(len);
    }
}
