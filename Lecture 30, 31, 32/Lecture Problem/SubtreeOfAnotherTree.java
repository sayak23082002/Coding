public class SubtreeOfAnotherTree {
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
    public static Node root1;
    public static Node root2;
    public static int i = -1;
    public static Node buildingATree(int a[]) {
        i++;
        if(a[i] == -1){
            return null;
        }
        Node newNode = new Node(a[i]);
        newNode.left = buildingATree(a);
        newNode.right = buildingATree(a);
        return newNode;
    }
    public static boolean isIndentical(Node root, Node subtreeRoot){
        if(root == null && subtreeRoot == null)
            return true;
        if(root == null || subtreeRoot == null || root.data != subtreeRoot.data || (!isIndentical(root.left, subtreeRoot.left) || !isIndentical(root.right, subtreeRoot.right))){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root, Node subtreeRoot){
        if(root == null)
            return false;

        if(root.data == subtreeRoot.data)
            if(isIndentical(root, subtreeRoot))
                return true;

        return isSubTree(root.left, subtreeRoot) || isSubTree(root.left, subtreeRoot);
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1,  3, -1, 6, -1, -1};
        int a[] = {2, 4, -1, -1, 5, -1, -1};
        root1 = buildingATree(n);
        i = -1;
        root2 = buildingATree(a);
        System.out.print(isSubTree(root1, root2));
    }
}