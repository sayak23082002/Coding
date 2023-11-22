import java.util.*;
public class Question4 {
    public static void rainwater (int height[]) {
        int l = height.length - 1;
        int leftHeighest [] = new int [l + 1];
        int rightHeighest [] = new int [l + 1];
        leftHeighest[0] = height[0];
        rightHeighest[l] = height[l];
        for(int i = 1; i <= l; i++)
            leftHeighest[i] = Math.max(leftHeighest[i - 1], height[i]);
        for(int j = l - 1; j >= 0; j--)
            rightHeighest[j] = Math.max(rightHeighest[j + 1], height[j]);
        int sum = 0;
        for(int i = 0; i <= l; i++)
            sum += (Math.min(leftHeighest[i], rightHeighest[i]) - height[i]);
        System.out.println("Total water: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++)
            height[i] = sc.nextInt();
        rainwater(height);
        sc.close();
    }
}