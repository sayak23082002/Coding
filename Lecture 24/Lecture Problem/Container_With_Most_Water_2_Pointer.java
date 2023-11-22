import java.util.*;
public class Container_With_Most_Water_2_Pointer {
    public static int waterSize(ArrayList<Integer> list, int lp, int rp){
        int water = 0;
        while(lp < rp)
        {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int volume = height * width;
            if(volume > water)
                water = volume;
            if(height == list.get(lp))
                lp++;
            else
                rp--;
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
        System.out.println(waterSize(list, 0, list.size() - 1));
    }
}