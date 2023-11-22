import java.util.LinkedList;
import java.util.Queue;

public class BuildingATree {
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
    public static int i = -1;
    public static class Diameter{
        int height;
        int diameter;
        Diameter(int h, int d){
            this.diameter = d;
            this.height = h;
        }
    }
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
    public static void preOrder(Node temp){
        if(temp == null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(temp.data + " ");
        preOrder(temp.left);
        preOrder(temp.right);
    }
    public static void inOrder(Node temp){
        if(temp == null){
            System.out.print(-1 + " ");
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data + " ");
        inOrder(temp.right);
    }
    public static void postOrder(Node temp){
        if(temp == null){
            System.out.print(-1 + " ");
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + " ");
    }
    public static void levelOrder(Queue<Node> q){
        if(q.isEmpty())
            return;
        Node t = q.peek();
        if(t.left != null)
            q.add(t.left);
        if(t.right != null)
            q.add(t.right);
        System.out.print(q.remove().data + " ");
        levelOrder(q);
    }
    public static int height(Node root){
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int countOfNodes(Node root){
        if(root == null)
            return 0;
        int ln = countOfNodes(root.left);
        int rn = countOfNodes(root.right);
        return (ln + rn + 1);

    }
    public static int sumOfNodes(Node root){
        if(root == null)
            return 0;
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return (ls + rs + root.data);

    }
    // public static int diameterM1(Node root){
    //     if(root == null)
    //         return 0;
    //     int ldiam = diameterM1(root.left); //maximum diameter in the left subtree
    //     int rdiam = diameterM1(root.right); //maximum diameter in the right subtree
    //     int currentDiam = height(root.left) + height(root.right) + 1; //height of the left subtree + height of the right subtree + 1
    //     return Math.max(currentDiam, Math.max(ldiam, rdiam));
    // }
    public static Diameter diameterM2(Node root){
        Diameter d = new Diameter(0, 0);
        if(root == null)
            return d;
        Diameter lInfo = diameterM2(root.left);
        Diameter rInfo = diameterM2(root.right);
        int selfDiam = rInfo.height + rInfo.height + 1; //maximum diameter of the path including self node
        d.diameter = Math.max(Math.max(rInfo.diameter, lInfo.diameter), selfDiam);
        d.height = Math.max(rInfo.height, rInfo.height) + 1;
        return d;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1,  3, -1, 6, -1, -1};
        root = buildingATree(n);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(q);
        System.out.println();
        System.out.println("Height is: " + height(root));
        System.out.println("Number of node is: " + countOfNodes(root));
        System.out.println("Sum of node is: " + sumOfNodes(root));
        System.out.print("Diameter of the tree is: " + diameterM2(root).diameter);
    }    
}