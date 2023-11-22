public class Largest_string {
    public static void main(String[] args) {
        String a[] = {"banana", "apple", "mango"};
        if(a[0].compareTo(a[1]) < 0){
            if(a[0].compareTo(a[2]) < 0){
                if(a[1].compareTo(a[2]) < 0){
                    System.out.println("First is: " + a[0]);
                    System.out.println("Second is: " + a[1]);
                    System.out.println("Third is: " + a[2]);
                }
                else{
                    System.out.println("First is: " + a[0]);
                    System.out.println("Second is: " + a[2]);
                    System.out.println("Third is: " + a[1]);
                }
            }
            else{
                System.out.println("First is: " + a[2]);
                System.out.println("Second is: " + a[0]);
                System.out.println("Third is: " + a[1]);
            }
        }
        else{
            if(a[1].compareTo(a[2]) < 0){
                if(a[1].compareTo(a[2]) < 0){
                    System.out.println("First is: " + a[1]);
                    System.out.println("Second is: " + a[0]);
                    System.out.println("Third is: " + a[2]);
                }
                else{
                    System.out.println("First is: " + a[1]);
                    System.out.println("Second is: " + a[2]);
                    System.out.println("Third is: " + a[0]);
                }
            }
            else{
                System.out.println("First is: " + a[2]);
                System.out.println("Second is: " + a[1]);
                System.out.println("Third is: " + a[0]);
            }
        }
    }
}
