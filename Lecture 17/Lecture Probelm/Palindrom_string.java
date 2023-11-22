import java.util.*;
public class Palindrom_string {
    static boolean checkPalindrom(String str){
        int n = str.length();
        for(int k = 0; k < n / 2; k++){
            if(str.charAt(k) == str.charAt(n - k - 1)){
                continue;
            }
            else{
                System.out.println("The string is not palindrom.");
                return false;
            }
        }
        System.out.println("The string is palindrom.");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkPalindrom(str);
        sc.close();
    }    
}