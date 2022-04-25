#include <stdio.h>

void findUnique (int a[], int N) {
	int unique;
	int i, j;
	for ( i = 0; i < N; i++ ) {
		unique = 1;
		for ( j = N-1; j > i; j-- ) {
			if ( a[i] == a[j] ) {
				unique = 0;
				break;
			}
		}
		
		if (unique) {
			printf ("%d is unique \n", a[i]);
		}
	}
}


int main() {
	int a[] = {-1, 2, -1, 3, 2};
	int N = sizeof(a) / 4;
	
	findUnique (a, N);
}
