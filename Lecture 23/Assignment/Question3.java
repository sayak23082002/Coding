public class Question3 {
    static boolean isSafe(int board[][], int r, int c, int digit){
        return (r >= 0 && c >= 0 && r <= board.length - 1 && c <= board[0].length - 1 && board[r][c] == 0);
    }
    static void print(int board[][]){
        for(int k = 0; k <= board.length - 1; k++){
            for(int l = 0 ; l <= board[0].length - 1; l++){
                System.out.print(board[k][l]);
            }
            System.out.println();
        }
    }
    static boolean findPaths(int board[][], int xMove[], int yMove[], int r, int c, int digit, int sol[][]){
        if(digit == 64){
            return true;
        }
        for(int k = 0; k <= xMove.length - 1; k++){
            if(isSafe(board, r + xMove[k], c + yMove[k], digit)){
                sol[r + xMove[k]][c + yMove[k]] = digit;
                if(findPaths(board, xMove, yMove, r + xMove[k], c + yMove[k], digit + 1, sol))
                return true;
                else
                board[r + xMove[k]][c + yMove[k]] = -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int board[][] = {
            {0, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1}
        };
        int sol[][] = new int[8][8];
        int xMove[] = {1, -1, 2, -2, 1, -1, 2, -2};
        int yMove[] = {2, 2, 1, 1, -2, -2, -1, -1};
        if(findPaths(board, xMove, yMove, 0, 0, 1, sol))
            print(sol);
    }
}
