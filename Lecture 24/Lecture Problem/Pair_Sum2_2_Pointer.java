import java.util.*;
public class Pair_Sum2_2_Pointer {
    public static boolean pairSum(ArrayList<Integer> list, int lp, int rp, int target){
        while(lp != rp)
        {
            int sum = list.get(lp) + list.get(rp);
            int n = list.size();
            if(sum == target)
                return true;
            else{
                if(sum < target)
                    lp = (lp + 1) % n;
                else
                    rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 11;
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int i = 0, lp =0, rp = 0;
        while(i < list.size() -1 ){
            if(list.get(i) > list.get(i + 1)){
                rp = i; 
                lp = i + 1;
                break;
            }
            i++;
        }
        System.out.println(pairSum(list, lp, rp, target));
    }
}
