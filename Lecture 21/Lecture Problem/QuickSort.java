public class QuickSort {
    static int quickSort(int a[], int start, int pivot){
        int p = a[pivot];
        int i = start - 1;
        for(int j = start; j <= pivot; j++){
            if(a[j] < p){
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = p;
        a[pivot] = a[i];
        a[i] = temp;
        return i;
    }

    static void partition(int a[], int start, int last){
        if(start >= last){
            return;
        }
        int p = quickSort(a, start, last);
        partition(a, start, p - 1);
        partition(a, p + 1, last);
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        partition(a, 0, a.length - 1);
        for (int k = 0; k <= a.length - 1; k++)
            System.out.print(a[k] + " ");
    }
}