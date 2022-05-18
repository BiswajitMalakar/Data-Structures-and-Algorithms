package Hard;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr1[] = {1,5,7,8,10};
        int arr2[] = {2,3,4,6,9};
        merge(arr1, arr2);
        mergeII(arr1, arr2);
        mergeIII(arr1, arr2);
        System.out.println();
        mergeIV(arr1, arr2);
    }


    /*
    Time Complexity : O(M*N) + O(M log M)
    Space Complexity : O(1)
     */
    static void merge ( int[] A, int[] B ) {
        for ( int i = 0; i < A.length; i++ ) {
            int small = 0;
            for ( int j = 0; j < B.length; j++ ) {
                if ( B[j] < B[small] )
                    small = j;
            }

            if ( A[i] > B[small] ) {
                int temp = A[i];
                A[i] = B[small];
                B[small] = temp;
            }
        }

        Arrays.sort(B);

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }



    /*
    Time Complexity : O(N+M) + O((M+N)log (M+N)) + O(M+N)
    Space Complexity : O(M+N)
     */
    static void mergeII ( int[] A, int[] B ) {
        int[] C = new int[A.length + B.length];

        int k = -1;
        for ( int i = 0; i < A.length; i++ ) {
            k++;
            C[k] = A[i];
        }

        for ( int j = 0; j < B.length; j++ ) {
            k++;
            C[k] = B[j];
        }

        Arrays.sort(C);

        k = -1;
        for ( int i = 0; i < A.length; i++ ) {
            k++;
            A[i] = C[k];
        }

        for ( int j = 0; j < B.length; j++ ) {
            k++;
            B[j] = C[k];
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }




    /*
    Time Complexity : O(N*M)
    Space Complexity : O(1)
     */
    static void mergeIII ( int[] A, int[] B ) {
        for ( int i = 0; i < A.length; i++ ) {
            if ( A[i] > B[0] ) {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
            }

            int num = B[0];

            // Put the value into the correct index.
            for ( int j = 1; j < B.length; j++ ) {
                if ( B[j] < num ) {
                    B[j-1] = B[j];
                }
                else {
                    B[j-1] = num;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }



    // Using Gap algorithm
    /*
    Time Complexity : O(N log N)
    Space Complexity : O(1)
     */

    // CODE WRITING STYLE IS NOT THAT GOOD SO I WILL COME BACK TO THIS LATER.
    static void mergeIV (int[] A, int[] B) {
        int gap = A.length + B.length + 1;
        int i , j;

        while ( gap >= 1 ) {
            gap /= 2;
            i = 0;
            j = gap;

            while ( j < (A.length+B.length) ) {
                int a = 0 , b = 0;

                if ( i >= A.length )
                    a = i - A.length;
                else
                    a = i;

                if ( j >= A.length )
                    b = j - A.length;
                else
                    b = j;

                if ( i < A.length && j < A.length ) {
                    if ( A[a] > A[b] ) {
                        int temp = A[a];
                        A[a] = A[b];
                        A[b] = temp;
                    }
                }
                else if ( i < A.length && j >= A.length ) {
                    if ( A[a] > B[b] ) {
                        int temp = A[a];
                        A[a] = B[b];
                        A[b] = temp;
                    }
                }
                else {
                    if ( B[a] > B[b] ) {
                        int temp = B[a];
                        B[a] = B[b];
                        B[b] = temp;
                    }
                }

                i++;
                j++;
            }
        }


        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }

}
