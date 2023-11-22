public class BinaryString {
    static void printBinryString(int n, int lastPlace, String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinryString(n - 1, 0, str+"0");
        if(lastPlace == 0)
            printBinryString(n - 1, 1, str+"1");
    }
    public static void main(String[] args) {
        printBinryString(3, 0,"");
    }
}
