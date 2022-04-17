// Move all negative elements to end
/*
Given an unsorted array arr[] of size N having both negative and positive integers.
The task is place all negative element at the end of array without changing the order of
positive element and negative element.

Example 1:

Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5


Example 2:

Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/



#include <stdio.h>

void doSegregate ( int a[], int N ) {
	int n[N];
	int p[N];
	int i=0, j=0;
	
	for ( int k = 0; k < N; k++ ) {
		if ( a[k] < 0 ) {
			n[i] = a[k];
			i++;
		}
		else {
			p[j] = a[k];
			j++;
		}
	}
	
	for ( int k = 0; k < j; k++ ) {
		a[k] = p[k];
	}
	
	for ( int k = j; k < N; k++ ) {
		a[k] = n[k-j];
	}
}


int main() {
	int a[] = {1, -1, 3, 2, -7, -5, 11, 6 };
	int N = sizeof(a) / 4;
	doSegregate(a, N);
	
	
	for ( int i = 0; i < N; i++ ) {
		printf ("%d ", a[i]);
	}
}
