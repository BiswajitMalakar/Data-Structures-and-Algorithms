#include <stdio.h>


void findCommon ( int a[], int b[], int c[], int X1, int X2, int X3 ) {
	int i = 0;
	int j = 0;
	int k = 0;
	
	int N1 = a[X1-1];
	int N2 = b[X2-1];
	int N3 = c[X3-1];
		
	
	if ( N1 <= N2 && N1 <= N3 ) {
		while ( i < X1 ) {
			if ( a[i] >= b[j] && a[i] >= c[k] ) {
				if ( a[i] == b[j] && a[i] == c[k] ) {
					printf ("%d\n", a[i]);
					i++;
					j++;
					k++;
				}
				else if ( a[i] == b[j] ){
					k++;
				}
				else if ( a[i] == c[k] ) {
					j++;
				}
				else {
					j++;
					k++;
				}
			}
			else {
				i++;
			}
		}
	}
	else if ( N2 <= N1 && N2 <= N3 ) {
		while ( j < X2 ) {
			if ( b[j] >= a[i] && b[j] >= c[k] ) {
				if ( b[j] == a[i] && b[j] == c[k] ) {
					printf ("%d\n", b[j]);
					i++;
					j++;
					k++;
				}
				else if ( b[j] == a[i] ){
					k++;
				}
				else if ( b[j] == c[k] ) {
					i++;
				}
				else {
					i++;
					k++;
				}
			}
			else {
				j++;
			}
		}
	}
	else {
		while ( k < X3 ) {
			if ( c[k] >= a[i] && c[k] >= b[j] ) {
				if ( c[k] == a[i] && c[k] == b[j] ) {
					printf ("%d\n", c[k]);
					i++;
					j++;
					k++;
				}
				else if ( c[k] == a[i] ){
					j++;
				}
				else if ( c[k] == b[j] ) {
					i++;
				}
				else {
					j++;
					i++;
				}
			}
			else {
				k++;
			}
		}
	}
	
}



int main() {
	int a[] = {1, 5, 10, 20, 40, 70, 80, 140, 140, 150};
	int b[] = {6, 7, 20, 70, 80, 100, 140, 140, 160};
	int c[] = {3, 4, 15, 20, 30, 70, 80, 120, 140, 140};
	
	int X1 = sizeof(a) / 4;
	int X2 = sizeof(b) / 4;
	int X3 = sizeof(c) / 4;

	findCommon (a, b, c, X1, X2, X3);
	
}
