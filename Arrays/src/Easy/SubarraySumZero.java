package Easy;
// MY MIND IS NOT WORKING...
public class SubarraySumZero {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        System.out.println(find(arr));
    }


    static boolean find ( int[] arr ) {
        int lo = 0, hi = 0, sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
            if ( (i > 0) && (sum > sum-arr[i]) ) {
                sum -= arr[i-1];
            }
            if (sum==0)
                return true;
        }

        return false;
    }
}
