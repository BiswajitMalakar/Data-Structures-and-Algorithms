package Easy;

import java.util.Arrays;

public class MoveNegetives {
    public static void main(String[] args) {
        int[] arr = {1,-4,2,-5,1,-9,-7,3};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void move ( int[] arr ) {
        int n = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < 0 ) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n++;
            }
        }
    }
}
