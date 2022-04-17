// Missing number in array
/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/


#include <stdio.h>

int sum ( int a[], int N ) {
	int ans = 0;
	for ( int i = 0; i < N; i++ ) {
		ans += a[i];
	}	
	
	return ans;
}



int getMissingOne ( int a[], int N ) {
	int total = ((N+1)*(N+2)) / 2;
	int missing = total - sum(a, N);
	
	return missing;
}

int main() {
	int a[] = {6,1,2,8,3,4,7,10,5};
	int N = sizeof(a) / 4;
	
	printf ("the missing one is : %d", getMissingOne(a, N) ); 
}
