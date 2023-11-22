import java.util.*;
public class BuildingBST{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node root;
    public static class Info{
        boolean isBST;
        int size;
        int max;
        int min;
        Info(boolean isBST,  int size, int max, int min){
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    public static Node createBST(Node root, int a){
        if(root == null){
            Node temp = new Node(a);
            root = temp;
            return root;
        }
        if(root.data > a){
            root.left = createBST(root.left, a);
        }
        if(root.data < a){
            root.right = createBST(root.right, a);
        }
        return root;
    }
    public static boolean searchInBST(Node root, int n){ //Time Complexity = O(H) for average case, and O{N} for worst case.
        if(root == null)
            return false;
        if(root.data == n)
            return true;
        if(root.data > n && searchInBST(root.left, n))
            return true;
        if(root.data < n && searchInBST(root.right, n))
            return true;
        return false;
    }
    public static void inOrder(Node temp, ArrayList<Integer> l){
        if(temp == null){
            return;
        }
        inOrder(temp.left, l);
        l.add(temp.data);
        System.out.print(temp.data + " ");
        inOrder(temp.right, l);
    }
    public static Node deleteNodeFromBST(Node root, int d){
        if(root == null){
            System.out.println("Node doesnot exist.");
            return null;
        }
        if(root.data > d){
            root.left = deleteNodeFromBST(root.left, d);
        }
        else if(root.data < d){
            root.right = deleteNodeFromBST(root.right, d);
        }
        else{
            //case 1 -
            if(root.left == null && root.right == null)
                return null;
            //case 2 -
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            //case 3 -
            Node temp = root.right;
            while(temp.left != null)
                temp = temp.left;
            root.data = temp.data;
            root.right = deleteNodeFromBST(root.right, temp.data);
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null)
            return;
        if(k1 <= root.data && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        if(k1 > root.data){
            printInRange(root.right, k1, k2);
        }
        if(root.data > k2){
            printInRange(root.left, k1, k2);
        }
    }
    public static void print(ArrayList<Integer> l){
        for(int k = 0; k < l.size(); k++)
            System.out.print(l.get(k) + "->");
        System.out.println("null");
    }
    public static void pathToLeaf(Node root, ArrayList<Integer> l){
        if(root == null)
            return;
        l.add(root.data);
        if(root.left == null && root.right == null){
            print(l);
        }
        pathToLeaf(root.left, l);
        pathToLeaf(root.right, l);
        l.remove(l.size() - 1);
    }
    public static boolean validateBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return validateBST(root.left, min, root) && validateBST(root.right, root, max);
    }
    public static void mirrorBST(Node root){
        if(root == null)
            return;
        mirrorBST(root.left);
        mirrorBST(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static Node balancedBST(Node root, int si, int ei, ArrayList<Integer> list){
        if(si > ei)
            return null;
        int mid = (si + ei) / 2;
        Node temp = new Node(list.get(mid));
        root = temp;
        root.left = balancedBST(root.left, si, mid - 1, list);
        root.right = balancedBST(root.right, (mid + 1), ei, list);
        return root;
    }
    public static int maxLength = 0;
    public static Info sizeOfLargestBST(Node root){
        if(root == null)
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        Info lInfo = sizeOfLargestBST(root.left);
        Info rInfo = sizeOfLargestBST(root.right);
        Info selfInfo;
        if(!lInfo.isBST || !rInfo.isBST || root.data < lInfo.max || root.data > rInfo.min){
            selfInfo = new Info(false, (lInfo.size + rInfo.size + 1), Integer.max(Integer.max(lInfo.max, rInfo.max), root.data), Integer.min(Integer.min(lInfo.min, rInfo.min), root.data));
        }else{
            selfInfo = new Info(true, (lInfo.size + rInfo.size + 1), rInfo.max, lInfo.min);
            maxLength = Math.max(maxLength, selfInfo.size);
        }
        return selfInfo;
    }
    public static void merge2BSTs(Node root1, Node root2, ArrayList<Integer> list){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        inOrder(root1, l1);
        inOrder(root2, l2);
        while(!l1.isEmpty() && !l2.isEmpty()){
            if(l1.get(0) < l2.get(0)){
                list.add(l1.get(0));
                l1.remove(0);
            }else{
                list.add(l2.get(0));
                l2.remove(0);
            }
        }
        while (!l1.isEmpty()) {
            list.add(l1.get(0));
            l1.remove(0);
        }
        while (!l2.isEmpty()) {
            list.add(l2.get(0));
            l2.remove(0);
        }
        root = balancedBST(root, 0, (list.size() - 1), list);
    }
    public static void main(String[] args) {
        int a[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        root = null;
        // Arrays.sort(a);
        // ArrayList<Integer> l = new ArrayList<>();
        for(int k = 0; k < a.length; k++){
            root = createBST(root, a[k]);
        }
        // inOrder(root, l);
        // System.out.println();
        // root = balancedBST(root, 0, a.length - 1, a);
        // System.out.println();
        // System.out.println(searchInBST(root, 1));
        // // deleteNodeFromBST(root, 14);
        // // inOrder(root);
        // printInRange(root, 5, 12);
        // System.out.println();
        // pathToLeaf(root, l);
        // System.out.print(validateBST(root, null, null));
        // mirrorBST(root);
        // inOrder(root);
        // sizeOfLargestBST(root);
        // System.out.print(maxLength);
        // merge2BSTs(root, root, l);
        // System.out.println(l);
    }
}