public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n + (n-1)); j++){
                if(j == (n - i + 1)){
                    if(i == 1 || i == n)
                        System.out.print("*****");
                    else
                        System.out.print("*   *");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
