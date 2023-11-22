public class ClimbingStares_Tabulation {
    public static void main(String[] args) {
        int n = 545;
        long a[] = new long[n + 1];
        a[0] = 1;
        for(int k = 1; k < a.length; k++){
            if(k == 1){
                a[k] = a[k - 1];
            }else{
                a[k] = a[k - 1] + a[k - 2];
            }
        }
        System.out.print(a[a.length - 1]);
    }
}
