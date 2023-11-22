import java.util.HashMap;

public class MajorityElement{
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 5, 1, 3, 3, 5, 1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int k = 0; k < a.length; k++){
            hm.put(a[k], hm.getOrDefault(a[k], 0) + 1);
        }
        for (Integer key : hm.keySet())
            if(hm.get(key) >= a.length / 3)
                System.out.print(key + " ");
    }
}