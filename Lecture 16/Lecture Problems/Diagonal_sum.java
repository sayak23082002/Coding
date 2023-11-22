public class Diagonal_sum {
    public static void main(String[] args) {
        // int m[][] = { { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 } };
        int m[][] = { { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 } };
        int r = m.length, c = m[0].length, sum = 0;
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                if (k == l)
                    sum = sum + m[k][l];
                else {
                    if ((k + l) == (r - 1))
                        sum = sum + m[k][l];
                }
            }
        }
        System.out.println(sum);
    }
}