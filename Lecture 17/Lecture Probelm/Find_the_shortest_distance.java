import java.util.*;
public class Find_the_shortest_distance {
    static void findLength(String str){
        int n = str.length(), x = 0, y = 0;
        for(int k = 0; k <= n - 1; k++){
            if(str.charAt(k) == 'N')
                y++;
            else{
                if(str.charAt(k) == 'S')
                    y--;
                else{
                    if(str.charAt(k) == 'E')
                        x++;
                    else
                        x--;
                }
            }
        }
        System.out.println("The distance is: " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findLength(str);
        sc.close();
    }
}
