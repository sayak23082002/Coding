public class HeapSort {
    public static void heapify(int a[], int i, int size){
        int leftNode = (2 * i) + 1;
        int rightNode = (2 * i) + 2;
        int maxIndex = i;

        if(leftNode < size && a[leftNode] > a[maxIndex]){
            maxIndex = leftNode;
        }
        if(rightNode < size && a[rightNode] > a[maxIndex]){
            maxIndex = rightNode;
        }
        if(maxIndex != i){
            int temp = a[maxIndex];
            a[maxIndex] = a[i];
            a[i] = temp;

            heapify(a, maxIndex, size);
        }
    }
    public static void heapSort(int arr[]){
        int n = arr.length;
        //maxheap
        for(int i = n / 2; i >= 0; i--){
            heapify(arr, i, n);
        }
        //swap
        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 2, 3, 1, 4};
        heapSort(a);
        for(int k = 0; k < a.length; k++){
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
