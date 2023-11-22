class SelectionSort{
    public static void selectionsort (int a[]) {
        int l = a.length - 1;
        for(int i = 0; i <= l; i++)
            for(int j = (i + 1); j <= l; j++)
                if(a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
        System.out.println("The array is:" );
        for(int i = 0; i <= l; i++) 
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int a [] = {3, 5, 1, 4, 2};
        selectionsort(a);
    }
}