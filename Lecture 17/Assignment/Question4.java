import java.util.*;
public class Question4 {
    static boolean checkAnagrams(String str1, String str2){
        for(int k = 0; k <= (str1.length() - 1); k++){
            int flag = 0;
            for(int l = 0; l <= (str1.length() - 1); l++)
                if(str1.charAt(k) == str2.charAt(l))
                    flag = 1;
            if(flag == 0){
                System.out.println("Not Anagrams.");
                return false;
            }
        }
        System.out.println("Anagrams.");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string: ");
        String str2 = sc.nextLine();
        checkAnagrams(str1, str2);
        sc.close();
    }
}
