public class Question5{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node root;
    public static int i = -1;
    public static int max = Integer.MIN_VALUE;
    public static Node createTree(int a[]){
        i++;
        if(a[i] == -1)
            return null;
        Node newNode = new Node(a[i]);
        newNode.left = createTree(a);
        newNode.right = createTree(a);
        return newNode;
    }
    public static int maxPath(Node root){
        if(root == null)
            return 0;
        int tempMaxLeft = maxPath(root.left);
        int tempMaxRight = maxPath(root.right);
        int tempMax = root.data + tempMaxLeft + tempMaxRight;
        if(tempMax > max)
            max = tempMax;
        if((tempMax - tempMaxLeft) == (tempMax - tempMaxRight))
            return root.data;
        if((tempMax - tempMaxLeft) > (tempMax - tempMaxRight))
            return root.data + tempMaxRight;
        return root.data + tempMaxLeft;
    }
    public static void main(String[] args) {
        // int n[] = {1, 2, -4, -1, -1, -5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int n[] = {-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        root = createTree(n);
        maxPath(root);
        System.out.print(max);
    }
}