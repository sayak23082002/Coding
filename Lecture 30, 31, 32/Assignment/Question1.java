public class Question1 {
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
    public static boolean univalued(Node root, int data){
        if(root == null)
            return true;
        if(root.data != data)
            return false;
        if(univalued(root.left, data) && univalued(root.right, data))
            return true;
        return false;
    }
    public static void main(String[] args) {
        int n[] = {2, 2, 2, -1, -1, 2, -1, -1,  2, -1, 2, -1, -1}, i = 2;
        root = createTree(n);
        System.out.print(univalued(root, i));
    }
}