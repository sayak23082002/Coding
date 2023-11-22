import java.util.*;
public class Pair_Sum1_2_Pointer {
    public static boolean pairSum(ArrayList<Integer> list, int lp, int rp, int target){
        while(lp < rp)
        {
            int sum = list.get(lp) + list.get(rp);
            if(sum == target)
                return true;
            else{
                if(sum < target)
                    lp++;
                else
                    rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 7;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, 0, list.size() - 1, target));
    }
}