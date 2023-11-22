public class KthLevel {
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
    public static void kthNodes(Node root, int l, int t){
        if(root == null){
            return;
        }
        if(l == t)
            System.out.println(root.data);
        kthNodes(root.left, l + 1, t);
        kthNodes(root.right, l + 1, t);
    }
    public static Node createTree(int a[]){
        i++;
        if(a[i] == -1)
            return null;
        Node newNode = new Node(a[i]);
        newNode.left = createTree(a);
        newNode.right = createTree(a);
        return newNode;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1,  3, -1, 6, -1, -1};
        root = createTree(n);
        kthNodes(root, 1, 3);
    }
}
