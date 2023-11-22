public class String_compression {
    public static void main(String[] args) {
        String str = "abbbccddddd";
        String sample = "";
        for(int k = 0; k < str.length(); k++){
            Integer count = 1;
            while(k < (str.length() - 1) && str.charAt(k) == str.charAt(k + 1)){
                count++;
                k++;
            }
            sample += str.charAt(k);
            if(count > 1){
                sample += count.toString();
            }
        }
        System.out.println(sample.toString());
    }
}