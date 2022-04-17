// Sort an array of 0s, 1s and 2s
/*
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.


Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/


/*
Important Points:
(1) The range from q to r is the undone part.
(2) 0 to p is for Zeros. p to q is for Ones. q to r is for Twos.
*/


#include <stdio.h>

void sort ( int a[], int N) {
	int p = 0, q = 0, r = N-1;
	
	while ( q <= r ) {
		if ( a[p]!=0 && a[r]!=2 ) {
			int temp = a[p];
			a[p] = a[r];
			a[r] = temp;
		}
		
		if ( a[q]!=1 && a[r]!=2 ) {
			int temp = a[q];
			a[q] = a[r];
			a[r] = temp;
		}
		
		if ( a[p]==0 ) 
		p++;
		
		if ( a[q]==1 ) 
		q++;
		
		if ( a[r]==2 ) 
		r--;
	}
}


int main() {
	int a[] = {1,2,0,0,1,2,0};
	int N = sizeof(a) / 4;
	
	printf ("%d", N);
	sort(a, N);
	
	printf ("after sorting....\n\n");
	for ( int i = 0; i < N; i++ ) {
		printf ("%d	",a[i]);
	}
}
