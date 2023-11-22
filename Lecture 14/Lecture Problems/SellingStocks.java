public class SellingStocks {
    public static void profit (int p []){
        int l = p.length - 1;
        int sp;
        int maxProfit = Integer.MIN_VALUE;
        int minBp = Integer.MAX_VALUE;
        for(int i = 1; i <= l; i++){
            sp = p[i];
            minBp = Math.min(minBp, p[i - 1]);
            int Profit = sp - minBp;
            if(Profit > maxProfit)
                maxProfit = Profit;
        }
        System.out.println("The maximum profit is: " + maxProfit);
    }
    public static void main(String[] args) {
        int p[] = {4, 3, 7, 3, 2, 4};
        profit(p);
    }
}