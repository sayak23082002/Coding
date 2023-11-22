import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {
    public static void main(String[] args) {
        int pair[] [] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int count = 1, lastSelected = 0;
        for(int k = 1; k < pair.length; k++){
            if(pair[k][0] > pair[lastSelected][1]){
                count++;
                lastSelected = k;
            }
        }
        System.out.print(count);
    }
}
