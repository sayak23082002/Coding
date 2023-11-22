public class Convert_to_uppercase {
    public static void main(String[] args) {
        String str = "hi, i am sayak";
        StringBuilder sample = new StringBuilder("");
        sample.append(Character.toUpperCase(str.charAt(0)));
        for(int k = 1; k <= (str.length() - 1); k++){
            sample.append(str.charAt(k));
            if(str.charAt(k) == ' ' && k < (str.length() - 1))
                sample.append(Character.toUpperCase(str.charAt(++k)));
        }
        System.out.println(sample.toString());
    }
}