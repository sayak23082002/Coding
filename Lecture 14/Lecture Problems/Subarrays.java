public class Subarrays {
    public static void subarrays(int a[]){
        int max = Integer.MIN_VALUE;
        int count = 1;
        int maxPos = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int sum = 0;
                System.out.print(count + "> ");
                for(int k = i; k <= j; k++){
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                System.out.print("Sum = " + sum);
                if(sum >= max){
                    max = sum;
                    maxPos = count;
                }
                ++count;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("The max sum is: " + max + " The subarray number is: " + maxPos);
    }
    public static void main(String[] args) {
        int a [] = {29, -39, 23, 10, -45};
        subarrays(a);
    }
}