import java.util.Arrays;
public class IndianCoins {
    public static void main(String[] args) {
        int a[] = {500, 100, 200, 50, 5, 2000, 2, 1, 10, 20}, target = 728;
        Arrays.sort(a);
        int i = a.length - 1, count = 0;
        while (i >= 0 || target != 0) {
            if(a[i] <= target){
                target -= a[i];
                System.out.print(a[i] + " ");
                count++;
            }else{
                i--;
            }
        }
        System.out.println();
        System.out.print("Total number of coins needed is: " + count);
    }
}