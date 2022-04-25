#include <stdio.h>

void quickSort (int a[], int low, int high) {
	if ( (high-low) <= 1 ) 
	return;
	
	int mid = (high+low)/2;
	
	int pivot = a[mid];
	
	int i = low, j = high;
	
	while ( i <= j ) {
		printf ("%d %d\n", i, j);
		if ( a[i] >= pivot && a[j] <= pivot ) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		else if ( (a[i] <= pivot) && (a[j] <= pivot) ) {
			i++;
		}
		else if ( (a[j] >= pivot) && (a[i] >= pivot) ) {
			j--;
		}
		else {
			i++;
			j--;
		}
	}
	
	quickSort (a, low, j);
	quickSort (a, i, high);
}



int main() {
	int a[] = {7, 10, 4, 3, 20, 15};
	int low = 0;
	int high = (sizeof(a) / 4)-1;

	quickSort (a, low, high);
	
	for ( low; low <= high; low++ ) {
		printf ("%d ", a[low]);
	}
}
