#include <stdio.h>

void findDuplicate (int a[], int N) {
	int i = 0; 
	int j = 0;
	for ( i = 0; i < N; i++ ) {
		for ( j = N-1; j > i; j-- ) {
			if ( a[i] == a[j] ) {
				printf ("%d appearence first occurs at %d index", a[i], i);
				return;
			}
		}
	}
}


int main() {
	int a[] = { 1,5,3,4,3,5,6 };
	int N = sizeof(a) / 4;
	
	findDuplicate (a, N);
}
