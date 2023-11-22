import java.util.Arrays;
import java.util.Comparator;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer hor[] = {4, 1, 2}, ver[] = {2, 1, 3, 1, 4};
        Arrays.sort(hor, Comparator.reverseOrder());
        Arrays.sort(ver, Comparator.reverseOrder());
        int h = 0, v = 0;//index
        int hp = 1, vp = 1;//pieces
        int cost = 0;
        while(h < hor.length && v < ver.length){
            if(hor[h] < ver[v]){
                cost += hp * ver[v];
                v++;
                vp++;
            }else{
                cost += vp * hor[h];
                h++;
                hp++;
            }
        }
        while(h < hor.length){
            cost += vp * hor[v];
            h++;
            hp++;
        }
        while(v < ver.length){
            cost += hp * ver[v];
            v++;
            vp++;
        }
        System.out.print("The total cost is: " + cost);
    }
}
