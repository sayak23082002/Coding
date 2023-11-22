public class Question1 {
    public static void main(String[] args) {
        int m[][] = { {4,7,8},{8,8,7} }, s = 7, count = 0;
        for(int k = 0; k <= m.length - 1; k++){
            for(int l = 0; l <= m[0].length - 1; l++){
                if(m[k][l] == s){
                    count++;
                }
            }            
        }
        System.out.println("The occurance of " + s + " is: " + count);
    }
}
