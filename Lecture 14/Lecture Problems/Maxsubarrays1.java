public class Maxsubarrays1 {
    public static void Maxsubarrays(int a[]){
        int prefix [] = new int [a.length];
        prefix[0] = a[0];
        for(int i = 1; i < a.length; i++)
            prefix[i] = prefix[i - 1] + a[i];
        int sum, max;
        max = sum = prefix[0];
        System.out.println("Sum = " + sum);
        for(int i = 1; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                sum = prefix[j] - prefix[(i - 1)];
                System.out.println("Sum = " + sum);
                if(sum >= max)
                    max = sum;
            }
        }
        System.out.print("The max sum is: " + max);
    }
    public static void main(String[] args) {
        int a [] = {-29, -39, -23, 10, 45};
        Maxsubarrays(a);
    }
}