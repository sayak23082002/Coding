public class Printing_Numbers_Backword {
    static void print_number(int n) {
        if( n > 0){
            System.out.println(n);
            print_number(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        print_number(n);
    }
}