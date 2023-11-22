public class Question1 {
    static int quickSort(String a[], int start, int pivot){
        String p = a[pivot];
        int i = start - 1;
        for(int j = start; j <= pivot; j++){
            if(p.compareToIgnoreCase(a[j]) > 0){
                i++;
                //swap
                String temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        String temp = p;
        a[pivot] = a[i];
        a[i] = temp;
        return i;
    }

    static void partition(String a[], int start, int last){
        if(start >= last){
            return;
        }
        int p = quickSort(a, start, last);
        partition(a, start, p - 1);
        partition(a, p + 1, last);
    }

    public static void main(String[] args) {
        String a[] = { "sun", "earth", "mars", "mercury" };
        partition(a, 0, a.length - 1);
        for (int k = 0; k <= a.length - 1; k++)
            System.out.print(a[k] + " ");
    }
}