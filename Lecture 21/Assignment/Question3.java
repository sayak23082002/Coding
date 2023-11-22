public class Question3 {
    static int count(int a[], int p){
        int count = 0;
        for(int k = (p - 1); k >= 0; k--)
            if(a[k] > a[p]){
                count++;
                System.out.println("(" + a[k] + "," + a[p] + ")");
            }
        return count;
    }
    static int chechkForLargerValue(int a[], int p){
        if(p <= 0) 
            return 0;
        int count = count(a, p);
        return count + chechkForLargerValue(a, (p - 1));
    }
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 6 };
        int p = a.length - 1;
        System.out.println("The total number of Inversion count is: " + chechkForLargerValue(a, p));
    }
}
