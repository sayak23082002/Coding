public class Maxsubarrays2 {
    public static void Maxsubarrays(int a[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            System.out.println("Current Sum: " + CurrentSum);
            CurrentSum = CurrentSum + a[i];
            if(CurrentSum < 0)
                CurrentSum = 0;
            System.out.println("Max Sum: " + MaxSum);
            if(CurrentSum > MaxSum)
                MaxSum = CurrentSum;
        }
        System.out.print("Maximum sum is: " + MaxSum);
    }
    public static void main(String[] args) {
        int a [] = {-2, 3, -4, -1, -2, 1, 5, -3};
        Maxsubarrays(a);
    }
}