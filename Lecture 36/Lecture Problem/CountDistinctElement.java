import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        int a[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> hs = new HashSet<>();
        for(int k = 0; k < a.length; k++){
            hs.add(a[k]);
        }
        for (Integer set: hs){
            System.out.print(set + " ");
        }
    }
}
