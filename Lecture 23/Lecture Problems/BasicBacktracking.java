public class BasicBacktracking {
    static void changeArray(int a[], int i, int v) {
        if(i == a.length){
            print(a);
            return;
        }
        a[i] = v;
        changeArray(a, i + 1, v + 1);
        a[i] = a[i] - 2;
    }
    static void print(int a[]) {
        for(int k = 0; k <= a.length - 1; k++)
            System.out.print(a[k] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = new int[5];
        changeArray(a, 0, 1);
        print(a);
    }    
}