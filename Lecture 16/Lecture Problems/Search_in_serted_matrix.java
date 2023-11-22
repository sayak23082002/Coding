public class Search_in_serted_matrix {
    static boolean search(int m[][], int s) {
        int r = m.length - 1, c = m[0].length - 1;
        int startingIndexforColumn = c, startingIndexforRow = 0;
        while (startingIndexforRow <= r && startingIndexforColumn >= 0) {
            if (m[startingIndexforRow][startingIndexforColumn] == s) {
                System.out.println("The element has found in the index: " + (startingIndexforRow + 1) + "th row and " +
                        (startingIndexforColumn + 1) + "th column");
                return true;
            } else {
                if (m[startingIndexforRow][startingIndexforColumn] > s) {
                    startingIndexforColumn--;
                } else
                    startingIndexforRow++;
            }
        }
        System.out.println("The element is not present in the matrix.");
        return false;
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } }, s = 11;
        // int m[][] = { { 1, 2, 3 },
        //         { 4, 5, 6 },
        //         { 7, 8, 9 } }, s = 10;
        search(m, s);
    }
}
