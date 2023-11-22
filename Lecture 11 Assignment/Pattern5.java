public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        // Own code
        for(int i = 1; i <= n; i++){
            int dig = 1;
            if(i % 2 == 0)
                dig = 0;
            for(int j = 1; j <= i; j++){
                System.out.print(dig + " ");
                if(dig == 1)
                    dig = 0;
                else
                    dig = 1;
            }
            System.out.println();
        }
        // Alpha code
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         if((i + j) % 2 == 0)
        //             System.out.print("1");
        //         else
        //             System.out.print("0");
        //     }
        //     System.out.println();
        // }
    }
}
