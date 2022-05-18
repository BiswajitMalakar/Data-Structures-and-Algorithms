package Medium;

public class Kadane {
    public static void main(String[] args) {
        int Arr[] = {1,2,3,-2,5};
        System.out.println(kedane(Arr));
        int Arr2[] = {-1,-2,-3,-4};
        System.out.println(kedane(Arr2));
    }


    static int kedane ( int[] arr ) {
        int cSum = 0, ans = Integer.MIN_VALUE;
        int lo = 0, hi = 0;

        while ( hi < arr.length ) {
            cSum += arr[hi];

            if ( ans < cSum )
                ans = cSum;

            if ( cSum < 0 ) {
                lo = hi + 1;
                hi = lo;
                cSum = 0;
            }
            hi++;
        }

        return ans;
    }
}
