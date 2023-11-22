import java.util.*;
public class Question3 {
    public static int profit (int p []){
        int l = p.length - 1;
        int sp;
        int maxProfit = 0;
        int minBp = Integer.MAX_VALUE;
        for(int i = 1; i <= l; i++){
            sp = p[i];
            minBp = Math.min(minBp, p[i - 1]);
            int Profit = sp - minBp;
            if(Profit > maxProfit)
                maxProfit = Profit;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int p[] = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++)
            p[i] = sc.nextInt();
        System.out.println("Profit: " + profit(p));
        sc.close();
    }
}