package Medium;

// I WILL GET BACK TO THIS PROBLEM SOON...

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {8,4,2,1};
        System.out.println(count(arr));
    }



    /*
    Time Complexity : O(N*N)
    Space Complexity : O(1)
     */
    static int count ( int[] arr ) {
        int ans = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = 0; j < arr.length; j++ ) {
                if ( arr[i] > arr[j] )
                    ans++;
            }
        }
        return ans;
    }



    /*
    Time Complexity : O(N log N) *Using Merge Sort technique
    Space Complexity : O(N)
     */



    // Merging two sorted non-decreasing arrays
    static int[] merge ( int[] A, int[] B ) {
        int[] ans = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while ( k < ans.length ) {
            if ( i < A.length && j < A.length ) {
                if ( A[i] < B[j] ) {
                    ans[k] = A[i];
                    k++;
                    i++;
                }
                else {
                    ans[k] = B[j];
                    k++;
                    j++;
                }

            }
            else if ( i >= A.length && j < B.length ) {
                ans[k] = B[j];
                k++;
                j++;
            }
            else {
                ans[k] = A[i];
                k++;
                i++;
            }
        }

        return ans;
    }
}
