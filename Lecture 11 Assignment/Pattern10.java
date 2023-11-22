public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n + (n - 1); j++){
                if(j <= (n - (n / 2) - i + 2) || j >= (n + i))
                    System.out.print(" ");
                else{
                    if(i % 2 == 0 && j % 2 == 0)
                        System.out.print(i);
                    else
                        if(i % 2 != 0 && j % 2 != 0)
                            System.out.print(i);
                        else
                            System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}