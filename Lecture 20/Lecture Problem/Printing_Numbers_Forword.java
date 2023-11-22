public class Printing_Numbers_Forword {
    static void print_number(int n) {
        if( n > 0){
            print_number(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        print_number(n);
    }
}
