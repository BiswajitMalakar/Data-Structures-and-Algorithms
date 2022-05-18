package Medium;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{-1,3}, {0,6}, {5,8}, {7,9}, {10,12}, {11,13}};
        int ans[][] = mergeIntervals(arr);
        for ( int[] i : ans )
            System.out.println(Arrays.toString(i));

        System.out.println();

        int[][] arrII = {{1,4}, {4,5}};
        ans = mergeIntervals(arrII);
        for ( int[] i : ans )
            System.out.println(Arrays.toString(i));
    }


    /*
    Time Complexity : O(N) *If given array is already in sorted non-decreasing order.
    Space Complexity : O(N*N + 2)
     */
    static int[][] mergeIntervals ( int[][] arr ) {
        int[][] ans = new int[arr.length][2];
        int j = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            // checking is there has any intervals or not
            if ( ans[0][0] == 0 && ans[0][1] == 0 ) {
                ans[0] = arr[i];
            }
            // checking is there has any duplicate
            else if ( arr[i][0] <= ans[j][1] ) {
                ans[j] = merge(ans[j], arr[i]);
            }
            else {
                j++;
                ans[j] = arr[i];
            }
        }
        return ans;
    }


    static int[] merge ( int[] A, int[] B ) {
            int[] ans = {A[0], B[1]};
            return ans;
    }
}
