public class Question1 {
    static void findElement(int a[], int i,int k) {
        if(i >= a.length)
            return;
        if(a[i] == k)
            System.out.println(i + " ");
        findElement(a, i + 1, k);
    }
    public static void main(String[] args) {
        int a[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        findElement(a, 0, 2);
    }    
}