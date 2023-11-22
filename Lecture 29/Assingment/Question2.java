import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        int l = -3, r = 3, k = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(l <= r){
            if(l > 0 && l % 2 != 0){
                list.add(l);
            }
            l++;
        }
        if(list.size() < (k + 1)){
            System.out.print("The elemnt is:" + 0);
        }else{
            System.out.print("The element is: " + list.get(k));
        }
    }
}
