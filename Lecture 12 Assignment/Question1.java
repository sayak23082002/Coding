import java.util.*;
class Question1 {
    public static int avg (int a, int b, int c){
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = avg(a, b, c);
        System.out.println("The average is: " + avg);
        sc.close();
    }
}