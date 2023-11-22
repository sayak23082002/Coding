public class Question2 {
    static int quickSort(int a[], int start, int pivot){
        int p = a[pivot];
        int i = start - 1;
        for(int j = start; j <= pivot; j++){
            if(a[j] < p){
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = p;
        a[pivot] = a[i];
        a[i] = temp;
        return i;
    }

    static void partition(int a[], int start, int last){
        if(start >= last){
            return;
        }
        int p = quickSort(a, start, last);
        partition(a, start, p - 1);
        partition(a, p + 1, last);
    }

    static int checkMajorityElement(int a[], int parameter){
        if(parameter >= (a.length - 1))
            return -1;
        int k = parameter, count = 0;
        while(k <= (a.length - 1) && a[k] == a[parameter]){
            k++;
            count++;
        }
        if((count - 1) >= ((a.length - 1) / 2))
            return (k - 1);
        return checkMajorityElement(a, k);
    }

    public static void main(String[] args) {
        int a[] = { 3,2,3 };
        partition(a, 0, a.length - 1);
        System.out.println("The majority element is: " + a[checkMajorityElement(a, 0)]);
    }
}