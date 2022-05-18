package Medium;
/*
THIS ANSWERS CAN BE MORE OPTIMIZED BY USING BIT WISE OPERATOR.
ONCE I LEARN ABOUT BITWISE OPERATOR THEN I WIL COMEBACK AND TRY THIS QUESTION.
 */
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {

        System.out.println( duplicate(new int[]{1,3,4,2,2}) );
        System.out.println( duplicate(new int[]{3,1,3,4,2}) );
        System.out.println( duplicate(new int[]{1,4,4,3,2}) );

        System.out.println( duplicateII(new int[]{1,3,4,2,2}) );
        System.out.println( duplicateII(new int[]{3,1,3,4,2}) );
        System.out.println( duplicateII(new int[]{1,4,4,3,2}) );
    }


    /*
    Time Complexity : O(N)
    Scape Complexity : O(N)
     */
    static int duplicate ( int[] arr ) {
        int frequency[] = new int[arr.length];
        int ans = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            frequency[arr[i]-1] += 1;
        }

        for ( int i = 0; i < frequency.length; i++ ) {
            if ( frequency[i] == 2 )
                ans = i+1;
        }

        return ans;
    }



    /*
    Time Complexity: O(N log N)
    Space Complexity : O(1)
     */
    static int duplicateII ( int[] arr ) {
        int ans = 0;
        Arrays.sort(arr);

        for ( int i = 0; i < arr.length-1; i++ ) {
            if ( arr[i] == arr[i+1] )
                ans = arr[i];
        }

        return ans;
    }

}
