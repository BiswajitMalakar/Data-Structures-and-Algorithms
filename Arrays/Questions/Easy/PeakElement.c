// Peak Element
/*
An element is called a peak element if its value is not smaller than the value of its
adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct.
Otherwise output will be 0.

Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.


Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.



Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)
*/


/*
WHAT IS PEAK ELEMENT : i will be a peak element if arr[i-1] <= arr[i] && arr[i+1] <= arr[i]

DETERMINE THE DIRECTION TO MOVE : look at the adjacent element and assume the direction.

*/


#include <stdio.h>

int findPeak (int a[], int N) {
	int s = 0, e = N-1, mid;
	
	while ( s <= e ) {
		mid = (s+e) / 2;
		if ( (mid!=0 && mid!=N-1) && (a[mid-1]<=a[mid] && a[mid]>=a[mid+1]) )
		return mid;
		else if ( (mid==0) && (a[mid]>=a[mid+1]) )
		return mid;
		else if ( (mid==N-1) && (a[mid]>=a[mid-1]) )
		return mid;
		
		if ( a[mid-1]>=a[mid] )
		e = mid-1;
		else
		s = mid+1;
	}
	
	return -1;
}


int main() {
	int a[] = {5,6,3,9,3,1,7,5,2};
	int N = sizeof(a) / 4;
	
	printf ("%d\n", N);
	int ans = findPeak (a, N);
	printf ("the peak index is in %d index", ans);
}


