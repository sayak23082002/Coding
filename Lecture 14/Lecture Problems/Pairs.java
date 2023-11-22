class Pairs {
    public static void Arraypairs(int a []){
        int c=0;
        for(int i = 0; i < a.length; i++){
            for(int j = (i + 1); j < a.length; j++){
                System.out.print("(" + a[i] + "," + a[j] + ")");
                c++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are: " + c);
    }
    public static void main(String[] args) {
        int a [] = {29, 39, 23, 10, 45};
        Arraypairs(a);
    }
}