package Easy;
// NOT DONE YET...
import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,1,0,1,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort ( int[] arr ) {
       int lo = 0, mid = 0, hi = arr.length-1;

       while ( mid <= hi ) {
           if ( arr[mid] == 0 ) {
               int temp = arr[mid];
               arr[mid] = arr[lo];
               arr[lo] = temp;
               lo++;
               mid++;
           }
           else if ( arr[mid] == 1 ) {
               mid++;
           }
           else {
               int temp = arr[mid];
               arr[mid] = arr[hi];
               arr[hi] = temp;
               hi--;
           }
       }
    }
}
