public class Pattern9 {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - 1; j++){
                if(i <= n / 2 + 1){
                    if(j < (n/2 - i + 1) || j > (n/2 + i - 1))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
                else{
                    if(j < (i - (n / 2)) || j > (((n - i) + (n / 2))))
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}