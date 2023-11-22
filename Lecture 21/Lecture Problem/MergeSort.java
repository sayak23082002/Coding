public class MergeSort {
    static void merge(int a[], int si, int mid, int ei) {
        int i = si, j = mid + 1, k = 0;
        int n[] = new int[(ei - si) + 1];
        while (i <= mid && j <= ei) {
            if (a[i] == a[j]) {
                n[k] = a[i++];
                n[++k] = a[j++];
                k++;
            } else {
                if (a[i] < a[j])
                    n[k++] = a[i++];
                else
                    n[k++] = a[j++];
            }
        }
        while (i <= mid)
            n[k++] = a[i++];
        while (j <= ei)
            n[k++] = a[j++];
        for (int x = 0, y = si; x <= n.length - 1; x++)
            a[y++] = n[x];
    }
    static void mergeSort(int a[], int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + ((ei - si) / 2);
        mergeSort(a, si, mid);
        mergeSort(a, (mid + 1), ei);
        merge(a, si, mid, ei);
    }
    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(a, 0, a.length - 1);
        for (int k = 0; k <= a.length - 1; k++)
            System.out.print(a[k] + " ");
    }
}