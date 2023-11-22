import java.util.*;
public class Question2 {
    public static int Binarysearch (int a[], int t){
        int s = 0, e = a.length - 1, mid = (s + e) / 2;
        while (s <= e) {
            if(a[mid] == t)
                return mid;
            else if(a[mid] > a[s] && a[s] > t)
                s = mid + 1;
            else
                e = mid - 1;
            mid = (s + e) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the target: ");
        int t = sc.nextInt();
        System.out.println("The index is: " + Binarysearch(a, t));
        sc.close();
    }
}
