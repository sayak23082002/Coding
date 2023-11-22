import java.util.ArrayList;

public class Question2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        
        ArrayList<Integer> sample = new ArrayList<>();

        int k = list.size() - 1;

        // int l = list.size() - 1;

        while(k >= 0){

            int t = list.get(k);

            list.remove(k);

            if(list.contains(t) || list.contains((t + 1)) || list.contains((t - 1))){
                list.add(t);
            }else{
                sample.add(t);
                list.add(t);
            }
            k--;
        }

        System.out.println(sample);

    }
}