import java.util.Arrays;
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int a[] = {9, 1, 4, 3};
        int b[] = {1, 3, 8, 5};
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for(int k = 0; k < a.length; k++){
            sum += Math.abs(a[k] - b[k]);
        }
        System.out.print("Minimum sum is: " + sum);
    }
}