public class Knapsack_0_1_Recursion {
    static int knapsack(int val[], int wei[], int cap, int i){
        if(i >= val.length || cap <= 0)
            return 0;
        if(wei[i] <= cap){
            int adding = val[i] + knapsack(val, wei, (cap - wei[i]), i + 1);
            int notAdding = knapsack(val, wei, cap, i + 1);
            return Math.max(adding, notAdding);
        }else{
            return knapsack(val, wei, cap, i + 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int val[] = new int[n];
        int wei[] = new int[n];
        int cap = 15;
        val[0] = 10;
        val[1] = 15;
        val[2] = 12;
        val[3] = 30;
        val[4] = 5;

        wei[0] = 5;
        wei[1] = 15;
        wei[2] = 2;
        wei[3] = 9;
        wei[4] = 4;
        int profit = knapsack(val, wei, cap, 0);
        System.out.println(profit);
    }    
}