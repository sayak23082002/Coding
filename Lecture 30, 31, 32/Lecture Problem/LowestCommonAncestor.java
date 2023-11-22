import java.util.ArrayList;

public class LowestCommonAncestor {
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
    public static boolean pathToParent(Node root, int data, ArrayList<Node> al){
        if(root == null){
            return false;
        }
        al.add(root);
        if(root.data == data){
            return true;
        }
        if(pathToParent(root.left, data, al) || pathToParent(root.right, data, al)){
            return true;
        }
        al.remove(root);
        return false;
    }
    public static int lca1(ArrayList<Node> al1, ArrayList<Node> al2){
        int l = Math.max(al1.size(), al2.size()), k = 0;
        while(k < l && al1.get(k).data == al2.get(k).data){
            k++;
        }
        if(k > l)
            return -1;
        return al1.get(k - 1).data;
    }
    public static Node lca2(Node root, int d1, int d2){
        if(root == null || root.data == d1 || root.data == d2){
            return root;
        }
        Node rightSubTree = lca2(root.right, d1, d2);
        Node leftSubTree = lca2(root.left, d1, d2);
        if(rightSubTree == null)
            return leftSubTree;
        if(leftSubTree == null)
            return rightSubTree;
        return root;
    }
    public static int distanceFromAncester(Node root, int d){
        if(root == null)
            return -1;
        if(root.data == d)
            return 0;
        int rd = distanceFromAncester(root.left, d);
        int ld = distanceFromAncester(root.right, d);
        if(rd != -1)
            return rd + 1;
        if(ld != -1)
            return ld + 1;
        return -1;
    }
    public static int kthAnester(Node root, int d, int t){
        if(root == null)
            return -1;
        if(root.data == d)
            return 0;
        int ld = kthAnester(root.left, d, t);
        int rd = kthAnester(root.right, d, t);
        if(ld == -1 && rd == -1)
            return -1;
        int max = Math.max(ld, rd);
        if(max + 1 == t)
            System.out.println("Ancestor is: " + root.data);
        return (max+1);
    }
    public static int sumTree(Node root){
        if(root == null)
            return 0;
        int ls = sumTree(root.left);
        int rs = sumTree(root.right);
        int t = root.data;
        root.data = (ls + rs);
        return t + root.data;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1,  3, -1, 6, -1, -1}, i1 = 2, i2 = 6;
        root = createTree(n);
        // ArrayList<Node> a1 = new ArrayList<>();
        // ArrayList<Node> a2 = new ArrayList<>();
        // pathToParent(root, i1, a1);
        // pathToParent(root, i2, a2);
        // System.out.println(lca1(a1, a2));
        Node a = lca2(root, i1, i2);
        System.out.println("Common ancester is: " + a.data);
        int d1 = distanceFromAncester(a, i1);
        int d2 = distanceFromAncester(a, i2);
        System.out.println("Total distance is: " + (d1 + d2));
        kthAnester(root, i1, 1);
        int t = root.data;
        System.out.print(sumTree(root) - t);
    }
}