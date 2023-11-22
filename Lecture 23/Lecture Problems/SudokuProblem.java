public class SudokuProblem {
    static boolean isSafeForGrid(int a[][], int r, int c, int x){
        int row = r + 2 - (r % 3), col = c + 2 - (c % 3);
        for(int k = row - 2; k <= row; k++){
            for(int l = col - 2; l <= col; l++){
                if(a[k][l] == x)
                    return true;
            }
        }
        return false;
    }
    static boolean isSafe(int a[][], int r, int c, int x){

        //for column
        
        for(int k = 0; k <= a[0].length - 1; k++){
            if(a[r][k] == x)
                return false;
        }

        //for row
        
        for(int k = 0; k <= a.length - 1; k++){
            if(a[k][c] == x)
                return false;
        }

        //for grid

        if(isSafeForGrid(a, r, c, x))
            return false;

        return true;
    }
    static boolean isSudokuPossible(int a[][], int k, int l){
        if(k == 9){
            return true;
        }
        int newk = k, newl = l + 1;
        if(newl == 9){
            newk = k + 1;
            newl = 0;
        }
            if(a[k][l] != 0){
                return isSudokuPossible(a, newk, newl);
            }
            for(int x = 1; x <= 9; x++){
                if(isSafe(a, k, l, x)){
                    a[k][l] = x;
                    if(isSudokuPossible(a, newk, newl))
                        return true;
                    a[k][l] = 0;
                }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        System.out.println(isSudokuPossible(a, 0, 0));
        for(int k = 0; k <= a.length - 1; k++){
            for(int l = 0; l <= a[0].length - 1; l++){
                System.out.print(a[k][l] + " ");
            }
            System.out.println();
        }
    }
}