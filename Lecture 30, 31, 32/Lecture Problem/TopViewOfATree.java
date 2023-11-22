import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfATree {
    public static class Node{
        int data;
        Node left;
        Node right;
        int hd;
        Node(int data, int hd){
            this.data = data;
            this.left = null;
            this.right = null;
            this.hd = hd;
        }
    }
    public static Node root;
    public static int i = -1;
    public static Node buildingATree(int a[], int hd) {
        i++;
        if(a[i] == -1){
            return null;
        }
        Node newNode = new Node(a[i], hd);
        newNode.left = buildingATree(a, (hd - 1));
        newNode.right = buildingATree(a, (hd + 1));
        return newNode;
    }
    public static void topView(){
        Queue<Node> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node t = q.remove();
            if(t == null){
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
                if(!map.containsKey(t.hd)){
                    map.put(t.hd, t);
                }
    
                if(t.left != null){
                    q.add(t.left);
                    min = Math.min(min, t.left.hd);
                }
                if(t.right != null){
                    q.add(t.right);
                    max = Math.max(max, t.right.hd);
                }
            }
        }
        for(int k = min; k <= max; k++){
            System.out.print(map.get(k).data + " ");
        }
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, -1, -1, 5, -1, -1,  3, -1, 6, -1, -1};
        root = buildingATree(n, 0);
        topView();
    }
}
