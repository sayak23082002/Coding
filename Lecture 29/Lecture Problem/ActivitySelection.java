public class ActivitySelection {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        System.out.print("The activities are: ");
        int endTime = 0, count = 0;
        for(int k = 0; k < start.length; k++){
            if(start[k] >= endTime){
                System.out.print("A" + k + " ");
                count++;
                endTime = end[k];
            }
        }
        System.out.println("Total work done: " + count);
    }
}