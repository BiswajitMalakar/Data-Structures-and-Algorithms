/*
Subarray with given sum

Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.


Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/



#include<stdio.h>

int subarraySum (int*, int, int);
int subarraySumM2 (int*, int, int);

int main() {
   int N = 5, S = 12;
   int A[] = {1,2,3,7,5};
   printf ("%d\n\n", subarraySum(A, N, S) );

   printf ("%d\n", subarraySumM2(A, N, S) );
}


// this is a simple solution.
int subarraySum (int array[], int N, int S) {
    int isFound = 0;
    int sum;

    for ( int i = 0; i < N; i++ ) {
        sum = S;
        for ( int j = i; j < N; j++ ) {
            sum -= array[j];
            if ( sum == 0 ) {
                printf ("continuous subset found from %d position to %d position.\n ", (i+1), (j+1));
                isFound = 1;
                return isFound;
            }
        }
    }

    if (!isFound) {
        printf ("Not found\n");
        return -1;
    }
}




// this is a optimized solution.
int subarraySumM2 ( int array[], int N, int S ) {

    int isFound = 0;
    int c_sum = array[0];
    // taking two pointers for determining the range if the subarray.
    int left = 0, right = 0;

    // loop untill the upper and lower bound does not exceds the N length.
    while ( right < N && left < N) {
        // if the subarray sum is equal with the given su then found the answer.
        if ( c_sum == S ) {
            printf ("%d %d\n", left, right);
            isFound = 1;
            return 1;
        }

        // if the subarray sum is smaller than the given sum then there has potential to add more elements to the subarray. And we add from the upper bound or right side.
        if ( c_sum < S ) {
            right++;
            c_sum += array[right];
        }
        // if the subarray sum is greater than the given sum then we have to remove some element from the subarray. And we remove from the lower bound or the left side
        else if ( c_sum > S ) {
            c_sum -= array[left];
            left++;
        } 
    }


    if (!isFound)
    return -1;

}