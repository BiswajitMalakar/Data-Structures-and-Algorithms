package Medium;
/*
THIS CAN BE OPTIMIZED TO O(N) USING PRIORITY QUEUE OR USING HEAP DATA STRUCTURE.
SADLY I DON'T KNOW THOSE DATA STRUCTURES SO I WILL GET BACK TO THIS QUESTION ONCE I HAVE ENOUGH KNOWLEDGE.
 */
import java.util.Arrays;

/*
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(log(n))
*/
public class FindKthMinimumANDMaximum {
    static int Kmax, Kmin;
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,10};
        KthMaxANDMin(arr, 2);
        System.out.println(Kmax);
        System.out.println(Kmin);
    }


    // Time Complexity : O(n log n)
    static void KthMaxANDMin ( int[] arr, int k ) {
        Arrays.sort(arr);
        Kmax = arr[arr.length-k];
        Kmin = arr[k-1];
    }

}
