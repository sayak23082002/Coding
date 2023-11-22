class InsertionSort{
    public static void insertionsort (int a[]) {
        int l = a.length - 1;
        for(int i = 1; i <= l; i++) {
            int min = a[i], t = i;
            for(int j = i - 1; j >= 0; j--) {
                if(a[j] > min) {
                    int temp = a[j];
                    a[j] = a[t];
                    a[t] = temp;
                    t = j;
                }
            }
        }
        System.out.println("The array is:" );
        for(int i = 0; i <= l; i++) 
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int a [] = {5, 3, 2, 1, 4};
        insertionsort(a);
    }
}