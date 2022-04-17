// Find duplicates in an array
/*
Given an array a[] of size N which contains elements from 0 to N-1,
you need to find all the elements occurring more than once in the given array.


Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.


Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.


Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
*/

/*
The idea is to create a frequency array since we know that the containing numbers of a[] are in between 
0 to N-1.
Initially the frequency array will store 0's for each numbers in a[] we will store 1 in that index of f[]
and if f[] index has 1 already means we got an duplicate.
*/

#include <stdio.h>

void printDuplicates ( int a[], int N ) {
	int f[N];
	
	for ( int i = 0; i < N; i++ ) {
		if ( f[a[i]] == 1 ) {
			printf ("%d ", a[i]);
		}
		else {
			f[a[i]] = 1;
		}
	}
	
}
int main() {
	int a[] = {2,3,1,2,3};
	int N = sizeof(a) / 4;
	printDuplicates(a, N);
}
