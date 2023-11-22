public class NQueen {
    static int count = 0;
    static boolean isSafe(char board[][], int row, int col){
        //check for verticle up

        for(int i = row - 1; i >= 0; i--)
            if(board[i][col] == 'Q')
                return false;
                
        //check for left up diagonal

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if(board[i][j] == 'Q')
                return false;
                
        //check for right up diagonal

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if(board[i][j] == 'Q')
                return false;

        return true;

    }
    static boolean nQueen(char board[][], int row){
        if(row == board.length){
            count++;
            print(board);
            return true;
        }
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen(board, row + 1))
                    return true;
                board[row][j] = 'X';
            }
        }
        return false;
    }
    static void print(char board[][]){
        System.out.println("---------chess board---------");
        for(int k = 0; k < board.length; k++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[k][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[n][n];
        for(int k = 0; k < board.length; k++){
            for(int j = 0; j < board[0].length; j++){
                board[k][j] = 'X';
            }
        }
        if(nQueen(board, 0))
            System.out.println("Solution is possibel.");
        else
            System.out.println("Solution is not possibel.");
        // System.out.println("Total ways for NQueen: " + count);
    }
}