package Questions.Easy;

import java.util.Arrays;

public class MinimizeHights {
    
    public static void main(String[] args) {
        System.out.println(minimize(new int[]{3, 9, 12, 16, 20}, 3));
    }


    static int minimize ( int[] a, int k ) {
        int diff = 0;

        Arrays.sort(a);
        int lo = 0;
        int hi = lo;

        for ( int i = 0; i < a.length; i++ ) {
            if ( i == lo ) {
                a[i] += k;
            }
        }

        return diff;
    }
}
