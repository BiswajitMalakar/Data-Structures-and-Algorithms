package Easy;

// THIS SOLUTION CAN BE OPTIMIZED BY USING HASH MAP.
// ONCE I GAIN ENOUGH KNOWLEDGE ABOUT HASH THEN I WILL COME BACK TO IT.
public class Pairs {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1};
        System.out.println(pairsI(arr, 6));
    }


    /*
    Time Complexity : O(N*N)
    Space Complexity : O(1)
     */
    static int pairsI ( int[] arr, int k ) {
        int count = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = i+1; j < arr.length; j++ ) {
                if ( (arr[i]+arr[j]) == k )
                    count++;
            }
        }
        return count;
    }
}
