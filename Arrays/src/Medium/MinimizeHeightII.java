package Medium;

import java.util.Arrays;

public class MinimizeHeightII {
    public static void main(String[] args) {
        System.out.println(minimizeHeightI(new int[]{3, 9, 12, 16, 20}, 3));
        System.out.println(minimizeHeightII(new int[]{3, 9, 12, 16, 20}, 3));
    }


    // time complexity  : O(N*N)
    // space complexity  : O(1)
    static int minimizeHeightI ( int[] arr, int k ) {
        int ansHeight = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            for ( int j = i+1; j < arr.length; j++ ) {
                if ( arr[i] < arr[j] ) {
                    int a = arr[i] + k;
                    int b = arr[j] - k;
                    int height = b - a;
                    if ( ansHeight < height ) {
                        ansHeight = height;
                    }
                }
                else {
                    int a = arr[i] - k;
                    int b = arr[j] + k;
                    int height = b - a;
                    if ( ansHeight < height ) {
                        ansHeight = height;
                    }
                }
            }
        }

        return ansHeight;
    }



    // time complexity  : O(N logN)
    // space complexity : O(N)
    static int minimizeHeightII ( int[] arr, int k ) {
        Arrays.sort(arr); // first sort the array.
        int ans = 0; // this will store the possible maximum height difference
        int small = arr[0] + k; // getting the smallest height
        int high = arr[arr.length-1] - k; // getting the largest height

        for ( int i = 0; i < arr.length; i++ ) { // getting all the heights one by one
            small = Math.min(small, arr[i]+k); // checking is the current height is the smallest or not after increasing by K
            high = Math.max(high, arr[i]-k); // checking is the current height is the largest or not after decreasing by K
            if ( (high-small) > ans ) { // after getting the small and high heights getting the difference and checking is it the maximum or not
                ans = (high-small); // if current height is maximum then store it into the ans variable.
            }
        }

        return ans;
    }


}
