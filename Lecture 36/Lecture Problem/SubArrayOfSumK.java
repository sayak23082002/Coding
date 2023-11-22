import java.util.HashMap;
public class SubArrayOfSumK {
    public static void main(String[] args) {
        int a[] = {10, 2, -2, -20, 10}, k = -10;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0, ans = 0;
        for(int j = 0; j < a.length; j++){
            sum += a[j];
            if(hm.containsKey(sum - k))
                ans += hm.get(sum - k);
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        System.out.print(ans);
    }
}