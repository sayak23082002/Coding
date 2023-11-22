public class Question2 {
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
    public static Node root1;
    public static Node root2;
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
    public static boolean checkMirror(Node root1, Node root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 != null && root2 != null){
            if(root1.data != root2.data)
                return false;
            if(checkMirror(root1.left, root2.right) && checkMirror(root1.right, root2.left))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1}, n2[] = {1, 3, 7, -1, -1, 6, -1, -1, 2, 5, -1, -1, 4, -1, -1};
        root1 = createTree(n1);
        i = -1;
        root2 = createTree(n2);
        System.out.print(checkMirror(root1, root2));
    }
}