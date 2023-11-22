public class Spiral_matrix {
    static void printRow(int s, int e, int m[][]){
        if(s == e){
            System.out.print(m[s][e] + " ");
        }
        else{
            for(int k = s; k <= e; k++){
                System.out.print(m[s][k] + " ");
            }
            for(int k = (s + 1); k <= e ; k++){
                System.out.print(m[k][e] + " ");
            }
            for(int k = (e - 1); k >= s; k--){
                System.out.print(m[e][k] + " ");
            }
            for(int k = (e - 1); k > s; k--){
                System.out.print(m[k][s] + " ");
            }
        }
    }
    public static void main(String[] args) {
        // int m [] [] = {{1, 2, 3, 4},
        //                {5, 6, 7, 8},
        //                {9, 10, 11, 12},
        //                {13, 14, 15, 16}};
        int m [] [] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        int sr = 0, ec = m[0].length;
        while(sr <= ec){
            printRow((sr), (ec - 1), m);
            sr++;ec--;
        }
    }    
}