class Pattern1 {
    public static void main(String[] args) {
        int n = 4, x = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=x; j++){
                if(i==1 || i==n || j==1 || j==x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}