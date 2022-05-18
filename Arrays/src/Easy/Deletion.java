package Easy;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 9;
        arr[2] = 70;
        arr[3] = 10;
        arr[4] = 20;
        arr[5] = 48;
        System.out.println(Arrays.toString(arr));
        delete(arr, 5);
        System.out.println(Arrays.toString(arr));
    }


    static void delete ( int[] A, int K ) {
        int j = K;
        if ( K == A.length-1 ) {
            A[K] = 0;
        }
        while ( j < A.length-1 ) {
            A[j] = A[j+1];
            j++;
        }
    }
}
