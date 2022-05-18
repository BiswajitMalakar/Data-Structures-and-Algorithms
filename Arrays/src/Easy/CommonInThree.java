package Easy;

public class CommonInThree {
    public static void main(String[] args) {
        int[] A = {1,3,5,7,9};
        int[] B = {0,1,2,4,8,9,10};
        int[] C = {1,2,3,4,5,6,7,8,9,10};
        intersection(A, B, C);
    }


    /*
    Time Complexity : O(N)
    Space Complexity : O(1)
    Arrays are needs to be sorted in ascending order.
     */
    static void intersection ( int[] A, int[] B, int[] C ) {
        int i = 0, j = 0, k = 0;

        while ( i < A.length && j < B.length && k < C.length ) {
            if ( A[i] == B[j] && B[j] == C[k] ) {
                System.out.println(A[i]);
                i++;
                j++;
                k++;
            }
            else if (A[i] < B[j] && A[i] < C[k] ) {
                i++;
            }
            else if ( B[j] < A[i] && B[j] < C[k] ) {
                j++;
            }
            else {
                k++;
            }
        }
    }
}
