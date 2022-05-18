package Easy;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 9;
        arr[2] = 70;
        arr[3] = 10;
        arr[4] = 20;

        System.out.println(Arrays.toString(arr));
        insert(arr, 2, 90);
        System.out.println(Arrays.toString(arr));
    }


    static void insert ( int[] A, int K, int ITEM ) {
        int j = A.length -1;
        while ( j >= K ) {
            A[j] = A[j-1];
            j --;
        }
        A[K] = ITEM;
    }
}
