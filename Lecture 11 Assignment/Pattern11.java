public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n + (n - 1); j++){
                int con = i;
                if(j <= n)
                    con = con + (n - i + 1) - j;
                else
                    con = con - (n + i - 1) + j;
                if(j <= (n - (n / 2) - i + 2) || j >= (n + i))
                    System.out.print(" ");
                else
                    System.out.print(con);
            }
            System.out.println();
        }
    }
}