import java.util.*;
public class Container_With_Most_Water_Brute_Force {
    public static int waterSize(ArrayList<Integer> list){
        int water = 0;
        for(int i = 0; i <= list.size() - 1; i++){
            for(int j = i + 1; j <= list.size() - 1; j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int volume = height * width;
                if(volume > water)
                    water = volume;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(waterSize(list));
    }
}