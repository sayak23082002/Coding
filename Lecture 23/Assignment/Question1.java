public class Question1 {
    static boolean isSafe(int a[][], int r, int c){
        if(r <= a.length - 1 && r >= 0 && c >= 0 && c <= a[0].length - 1 && a[r][c] == 1)
            return true;
        return false;
    }
    static void printWays(int s[][]){
        for(int k = 0; k <= s.length - 1; k++){
            for(int l = 0; l <= s[0].length - 1; l++){
                System.out.print(s[k][l] + " ");
            }
            System.out.println();
        }
    }
    static boolean findTheWays(int a[][], int r, int c, int s[][]){
        if(r == a.length - 1 && c == a[0].length - 1 && a[r][c] == 1){
            s[r][c] = 1;
            printWays(s);
            return true;
        }
        if(isSafe(a, r, c)){
            if(s[r][c] == 1)
                return false;
            s[r][c] = 1;
            if(findTheWays(a, r + 1, c, s))
                return true;
            if(findTheWays(a, r, c + 1, s))
                return true;
            s[r][c] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 1}
        };
        int s[][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        if(findTheWays(a, 0, 0, s))
            System.out.println("Solution is: ");
        else
            System.out.println("Solution doesnot exist.");
    }
}