import java.util.HashMap;

public class ValidAnagram {
    public static boolean checkValidAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int k = 0; k < str1.length(); k++)
            hm.put(str1.charAt(k), hm.getOrDefault(str1.charAt(k), 0) + 1);
        for(int k = 0; k < str2.length(); k++){
            if(hm.containsKey(str2.charAt(k))){
                hm.put(str2.charAt(k), hm.get(str2.charAt(k)) - 1);
                if(hm.get(str2.charAt(k)) == 0)
                    hm.remove(str2.charAt(k));
            }else
                return false;
        }
        if(hm.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String str1 = "care", str2 = "race";
        System.out.print(checkValidAnagram(str1, str2));
    }
}
