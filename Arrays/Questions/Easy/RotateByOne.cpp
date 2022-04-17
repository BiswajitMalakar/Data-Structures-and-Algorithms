// Cyclically rotate an array by one

/*
Given an array, rotate the array by one position in clock-wise direction.

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

#include <stdio.h>

void rotate ( int a[], int N ) {
	int temp = a[N-1];
	
	for ( int i = N-1; i > 0; i-- ) {
		a[i] = a[i-1];
		a[i-1] = 0;
	}
	
	a[0] = temp;
}


int main() {
	int a[] = {9, 8, 7, 6, 4, 2, 1, 3};
	int N = sizeof(a) / 4;
	rotate(a, N);
	
	for ( int i = 0; i < N; i++ ) {
		printf ("%d ", a[i]);
	}
}
