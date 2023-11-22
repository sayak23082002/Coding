import java.util.*;

public class MAXAreaInHistogram {

    public static void calculateNSL(int h[], int nsl[]){

        Stack<Integer> s = new Stack<>();

        int i = 0;

        while(i < h.length){

            if(s.isEmpty()){

                nsl[i] = -1;

                s.push(i);

                i++;

            }else{

                if(h[i] > h[s.peek()]){

                    nsl[i] = s.peek();

                    s.push(i);

                    i++;

                }else{

                    s.pop();

                }

            }

        }

    }

    public static void calculateNSR(int h[], int nsr[]){

        Stack<Integer> s = new Stack<>();

        int i = h.length - 1;

        while(i >= 0){

            if(s.isEmpty()){

                nsr[i] = h.length;

                s.push(i);

                i--;

            }else{

                if(h[i] > h[s.peek()]){

                    nsr[i] = s.peek();

                    s.push(i);

                    i--;

                }else{

                    s.pop();

                }

            }

        }

    }

    public static int checkLargestArea(int a[], int h[], int nsl[], int nsr[]){

        int max = Integer.MIN_VALUE, i = 0;

        for(int k = 0; k < nsl.length; k++){

            a[k] = h[k] * (nsr[k] - nsl[k] - 1);

            if(a[k] > max){

                i = k;

                max = a[k];

            }

        }
        
        return i + 1;

    }

    public static void main(String[] args) {

        int h[] = {1, 6, 7, 6, 3, 1};
        
        int nsl[] = new int[h.length];

        int nsr[] = new int[h.length];
        
        int a[] = new int[h.length];

        calculateNSL(h, nsl);

        calculateNSR(h, nsr);

        int i = checkLargestArea(a, h, nsl, nsr);

        System.out.println("The maximum area is: " + a[i] + " and it is formed by element at index: " + i);

        // for(int k = 0; k < nsl.length; k++){

        //     System.out.print(nsl[k] + " ");

        // }

        // System.out.println();
        
        // for(int k = 0; k < nsl.length; k++){

        //     System.out.print(nsr[k] + " ");

        // }



    }
}
