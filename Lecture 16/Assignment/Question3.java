public class Question3 {
    public static void main(String[] args) {
        int m1[][] = {{1, 2, 3}, {4, 5, 6}};
        int m2[][] = new int[m1[0].length][m1.length];
        for(int k = 0; k <= m1.length -1 ; k++){
            for(int l = 0; l <= m1[0].length - 1; l++){
                m2[l][k] = m1[k][l];
            }
        }
        for(int k = 0; k <= m2.length - 1; k++){
            for(int l = 0; l <= m2[0].length - 1; l++){
                System.out.print(m2[k][l] + " ");
            }
            System.out.println();
        }
    }
}
