import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100, 120};
        int w = 50;

        double ratio[][] = new double[value.length][2];

        for(int k = 0; k < value.length; k++){
            ratio[k][0] =k;
            ratio[k][1] = value[k] / weight[k];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int n = ratio.length, cost = 0;

        for(int k = n - 1; k >= 0; k--){
            int i = (int)ratio[k][0];
            if(weight[i] <= w){
                w -= weight[i];
                cost += value[i];
            }else{
                cost += (ratio[k][1] * w);
                w = 0;
                break;
            }
        }

        System.out.print("The cost is: " + cost);

    }
}
