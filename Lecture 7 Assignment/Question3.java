import java.util.*;
class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float rubber = sc.nextFloat();
        float add = pen + pencil + rubber;
        System.out.println("The total cost is: " + (add+(add*(18/100))) + " * with GST 18%");
        sc.close();
    }
}