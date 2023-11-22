class BubbleSort{
    public static void bubblesort (int a[]) {
        int l = a.length - 1;
        for(int i = 0; i <= (l - 1); i++) {
            for(int j = 0; j < (l - i); j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The array is:" );
        for(int i = 0; i <= l; i++) 
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int a [] = {3, 5, 1, 4, 2};
        bubblesort(a);
    }
}