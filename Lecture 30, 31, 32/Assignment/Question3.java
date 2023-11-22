public class Question3 {
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
    public static Node createTree(int a[]){
        i++;
        if(a[i] == -1)
            return null;
        Node newNode = new Node(a[i]);
        newNode.left = createTree(a);
        newNode.right = createTree(a);
        return newNode;
    }
    public static void deleteLeaf(Node root, int x){
        if(root == null)
            return;
        deleteLeaf(root.left, x);
        deleteLeaf(root.right, x);
        if(root.left == null && root.right == null && root.data == x){
            System.out.println(root.data);
            root = null;
        }
    }
    public static void main(String[] args) {
        int n[] = {2, 2, 2, -1, -1, 2, -1, -1,  2, -1, 3, -1, -1}, i = 2;
        root = createTree(n);
        deleteLeaf(root, i);
    }
}
