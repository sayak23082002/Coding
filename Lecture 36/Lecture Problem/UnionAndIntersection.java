import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int a1[] = {7, 3, 9};
        int a2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> unionSet = new HashSet<>();
        for(int k = 0; k < a1.length; k++)
            unionSet.add(a1[k]);
        for(int k = 0; k < a2.length; k++)
            unionSet.add(a2[k]);
        System.out.println("The size of the union set is: " + unionSet.size());
        int intersectionCount = 0;
        HashSet<Integer> intersectionSet = new HashSet<>();
        for(int k = 0; k < a1.length; k++)
            intersectionSet.add(a1[k]);
        for(int k = 0; k < a2.length; k++){
            if(intersectionSet.contains(a2[k])){
                intersectionCount++;
                intersectionSet.remove(a2[k]);
            }
        }
        System.out.print("The size of the intersection set is: " + intersectionCount);
    }
}