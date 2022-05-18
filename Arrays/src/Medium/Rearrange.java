package Medium;
// THIS SOLUTION CAN BE MORE OPTIMIZED.
// I WILL COME BACK SOON...
import java.util.ArrayList;
import java.util.Arrays;


public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,-1,4,-5};
        System.out.println(Arrays.toString(rearrange(arr)));
        //rearrangeII(arr);
        //rearrangeIII(arr);
        rearrangeIV(arr);
    }



    /*
    Time Complexity : O(N+N)
    Space Complexity : O(N+M+N)
     */
    static int[] rearrange ( int[] arr ) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] ans = new int[arr.length];

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] >= 0 )
                positive.add(arr[i]);
            else
                negative.add(arr[i]);
        }

        int i = 0, j = 0, k = 0;
        while ( i < ans.length ){
            if ( j < positive.size() ) {
                ans[i] = positive.get(j);
                j++;
                i++;
            }
            if ( k < negative.size() ) {
                ans[i] = negative.get(k);
                k++;
                i++;
            }

        }
        return ans;
    }




    /*
    Time Complexity : O(N*N)
    Space Complexity : O(1)
    In this solution elements appearing orders are not maintained!
     */
    static void rearrangeII ( int[] arr ) {
        for ( int i = 0; i < arr.length-1; i++ ) {
            int positive = i;
            int negative = i+1;
            if ( arr[positive] >= 0 ) {
                positive++;
            }
            else {
                for ( int t = i+1; t < arr.length; t++ ) {
                    if ( arr[t] >= 0 ) {
                        int temp = arr[positive];
                        arr[positive] = arr[t];
                        arr[t] = temp;
                        positive++;
                        break;
                    }
                }
            }

            if ( arr[negative] < 0 ) {
                negative++;
            }
            else {
                for ( int t = i+1; t < arr.length; t++ ) {
                    if ( arr[t] < 0 ) {
                        int temp = arr[negative];
                        arr[negative] = arr[t];
                        arr[t] = temp;
                        negative++;
                        break;
                    }
                }
            }

            i = positive;
        }

        System.out.println(Arrays.toString(arr));
    }



    /*
    Time Complexity : O(N*N*N)
    Space Complexity : O(1)
    In this solution appearing elements orders are maintained.
     */
    static void rearrangeIII ( int[] arr ) {
        for ( int i = 0; i < arr.length; i++ ) {
            if ( (i%2==0) && (arr[i] < 0) ) {
                for ( int t = i+1; t < arr.length; t++ ) {
                    if ( arr[t] >= 0 ) {
                        rotate(arr, t, i);
                        break;
                    }
                }
            }

            if ( (i%2!=0) && (arr[i] >= 0) ) {
                for ( int t = i+1; t < arr.length; t++ ) {
                    if ( arr[t] < 0 ) {
                        rotate(arr, t, i);
                        break;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }

    static void rotate ( int[] arr, int K, int T ) {
        int X = arr[K];

        for ( int i = K-1; i >= T; i-- ) {
            int temp = arr[i];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }

        arr[T] = X;
    }




    /*
    Time Complexity : O(N*N)
    Space Complexity : O(1)
    // This solution has some issues. I will come back and try...
     */
    static void rearrangeIV ( int[] arr ) {
        int extra = -1;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( (i%2==0) && (arr[i]<0) ) {
                if ( extra != -1 ) {
                    if ( arr[extra] >= 0 ) {
                        rotate(arr, i, extra);
                        extra = -1;
                    }
                }
                else
                    extra = i;
            }

            if ( (i%2!=0) && (arr[i]>=0) ) {
                if ( extra != -1 ) {
                    if ( arr[extra] < 0 ) {
                        rotate(arr, i, extra);
                        extra = -1;
                    }
                }
                else
                    extra = i;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
