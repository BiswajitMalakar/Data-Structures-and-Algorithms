package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void rotate ( int[] arr ) {
        int temp = arr[arr.length-1];

        for ( int i = arr.length-2; i >= 0; i-- ) {
            arr[i+1] = arr[i];
        }

        arr[0] = temp;
    }

}
