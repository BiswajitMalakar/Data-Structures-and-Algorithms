package Easy;

public class FindMinimumANDMaximum {
    static int min, max;
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,2};
        getMinANDMax(arr);
        System.out.println(min);
        System.out.println(max);
    }

    static void getMinANDMax ( int[] arr ) {
        min = arr[0];
        max = arr[0];
        for ( int i = 1; i < arr.length; i++ ) {
            if ( min > arr[i] )
                min = arr[i];

            if ( max < arr[i] )
                max = arr[i];
        }
    }
}
