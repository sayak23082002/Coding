import java.util.Stack;

public class Question1{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root;
    public static class Info{
        boolean isBST;
        int bstMax;
        int bstMin;
        int sum;
        Info(boolean isBST, int bstMax, int bstMin, int sum){
            this.isBST = isBST;
            this.bstMax = bstMax;
            this.bstMin = bstMin;
            this.sum = sum;
        }
    }
    public static Node buildBST(Node root, int a[], int k){
        if(root == null){
            return new Node(a[k]);
        }
        if(root.data > a[k]){
            root.left = buildBST(root.left, a, k);
        }else{
            if(root.data < a[k]){
                root.right = buildBST(root.right, a, k);
            }
        }
        return root;
    }
    public static int sum = 0;
    public static void findSum(Node root, int si, int ei){
        if(root == null){
            return;
        }
        if(root.data >= si && root.data <= ei){
            sum += root.data;
        }
        findSum(root.left, si, ei);
        findSum(root.right, si, ei);
    }
    public static int closest = 0;
    public static int closestDiff = Integer.MAX_VALUE;
    public static void findClosest(Node root, int t){
        if(root == null)
            return;
        int temp = (Math.max(t, root.data) - Math.min(t, root.data));
        if(temp < closestDiff){
            closest = root.data;
            closestDiff = temp;
        }
        findClosest(root.left, t);
        findClosest(root.right, t);
    }
    public static void inOrder(Node root, Stack<Integer> stack){
        if(root == null)
            return;
        inOrder(root.left, stack);
        stack.add(root.data);
        inOrder(root.right, stack);
    }
    public static int maxBSTSum = Integer.MIN_VALUE;
    public static Info findMAXSumBST(Node root){
        if(root == null)
            return new Info(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        Info lST = findMAXSumBST(root.left);
        Info rST = findMAXSumBST(root.right);
        if(lST.isBST && rST.isBST ){}
    }
    public static void main(String[] args) {
        int a[] = {4, 2, 6, 1, 9, 3,}, si = 2, ei = 5, t = 5, x = 3;
        root = null;
        Stack<Integer> stack = new Stack<>();
        for(int k = 0; k < a.length; k++){
            root = buildBST(root, a, k);
        }
        // findSum(root, si, ei);
        // System.out.println(sum);
        // findClosest(root, t);
        // System.out.print(closest + " " + closestDiff);
        inOrder(root, stack);
        int f = 0;
        for(int k = 0; k < x - 1; k++){
            if(stack.isEmpty()){
                f = 1;
                break;
            }
            stack.pop();
        }
        if(f == 1){
            System.out.print("Tree doesnot have sufficeint elements.");
        }else{
            System.out.print(stack.peek());
        }
    }
}