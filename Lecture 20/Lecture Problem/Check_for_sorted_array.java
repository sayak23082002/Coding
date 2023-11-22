public class Check_for_sorted_array {
    static boolean IssortedAyyay(int a[], int s, int e) {
        if(e == a.length - 1){
            System.out.println("The arrya is sorted.");
            return true;
        }
        if(a[s] > a[e]){
            System.out.println("The arrya is not sorted.");
            return false;
        }
        return IssortedAyyay(a, s + 1, e + 1);
    }
    public static void main(String[] args) {
        int a[] ={1, 2, 3, 4, 6, 6, 8};
        IssortedAyyay(a, 0, 1);
    }
}
