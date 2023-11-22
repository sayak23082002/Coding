public class Question4 {
    public static void main(String[] args) {
        char ch = ' ';
        for(ch ='A'; ch <= 'Z'; ch++)
            System.out.print((char)(ch|' ') + " ");
    }
}