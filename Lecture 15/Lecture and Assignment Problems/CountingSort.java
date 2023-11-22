public class CountingSort {
    public static void countingSort (int a[]) {
        int max = Integer.MIN_VALUE;
        int l = a.length - 1;
        for (int i = 0; i <= l; i++)
            if (a[i] > max)
                max = a[i];
        int count [] = new int[max + 1];
        for(int i = 0; i <= max; i++) {
            
        }
    }
    public static void main(String[] args) {
        int a [] = {5, 3, 2, 1, 4};
        countingSort(a);
    }
}
