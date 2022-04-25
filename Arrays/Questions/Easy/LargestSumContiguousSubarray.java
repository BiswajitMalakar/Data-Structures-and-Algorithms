package Questions.Easy;

public class LargestSumContiguousSubarray {
    
    public static void main(String[] args) {
        System.out.println(largestSum(new int[]{4,-2,1,5,-9,2,7,-8}));
    }

    static int largestSum ( int[] a ) {
        int maxSum = 0;
        int sum = 0;

        for ( int i = 0; i < a.length; i++ ) {
            sum += a[i];
            if ( maxSum < sum ) {
                maxSum = sum;
            }

            if ( sum < 0 ) {
                sum = 0;
            }

        }

        return maxSum;
    }
}
