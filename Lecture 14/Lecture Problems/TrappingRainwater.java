public class TrappingRainwater {
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
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        rainwater(height);
    }
}
