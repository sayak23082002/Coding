public class Question3 {
    static int lengthOfaString(String s) {
        if(s.length() == 0)
            return 0;
        return lengthOfaString(s.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfaString("sayak"));
    }
}
