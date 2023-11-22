public class Search_Rotated_Sorted_Array_Part2 {
    static void searchRotatedSortedArray(int a[], int si, int ei, int target) {
        int mid = si + ((ei - si) / 2);
        System.out.println("Starting = " + si + ", Ending = " + ei + ", Mid = " + mid);
        if (a[mid] == target) {
            System.out.println("Element has found at index: " + (mid + 1));
            return;
        }
        if (si >= ei) {
            System.out.println("Element not found.");
            return;
        }
        if (a[mid] <= target && target <= a[ei]) {
            searchRotatedSortedArray(a, mid + 1, ei, target);
        } else {
            searchRotatedSortedArray(a, si, mid, target);
        }
        // if (a[si] <= target && target <= a[mid]) {
        //     searchRotatedSortedArray(a, si, mid, target);
        // } else {
            // searchRotatedSortedArray(a, mid + 1, ei, target);
        // }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 0, 1, 2, 3 };
        int target = 6;
        searchRotatedSortedArray(a, 0, a.length - 1, target);
    }
}
