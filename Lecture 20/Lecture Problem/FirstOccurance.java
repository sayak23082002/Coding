public class FirstOccurance {
    static int first(int a[], int n, int i) {
        if(i == a.length - 1)
            return -1;
        if(a[i] == n)
            return n;
        return first(a, n, i + 1);
    }
    public static void main(String[] args) {
        int a[] ={1, 2, 3, 4, 6, 6, 8}, n = 6;
        System.out.println("The first occurance is: " + first(a, n, 0));
    }
}