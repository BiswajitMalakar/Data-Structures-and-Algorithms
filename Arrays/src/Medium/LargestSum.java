package Medium;

public class LargestSum {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        System.out.println(largestSum(arr));
    }


    static int largestSum ( int[] arr ) {
        int lo = 0, hi = 0;
        int ans = Integer.MIN_VALUE, cSum = 0;

        while ( hi < arr.length ) {
            cSum += arr[hi];
            if ( cSum > ans )
                ans = cSum;

            if ( cSum < 0 ) {
                cSum = 0;
                lo = hi+1;
                hi = lo;
            }
            else{
                hi++;
            }
        }

        return ans;
    }
}
