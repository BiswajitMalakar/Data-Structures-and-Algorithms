# ARRAYS

**An array is a collection of elements of the *same type* placed in *contiguous memory locations* that can be *individually referenced by using an index* to a unique identifier.**





## DECLARATION OF ARRAYS
Format : 
` datatype array_name [size]; `

**datatype** can be any primtive datatype like int, float, double, char, bool etc.

**array_name** is any user given name that must follow basic namming rules.

**size** must be +ve and should be in the range of integer number.


Example : 
` int a[100];`


## MAGIC IS HAPPENING INTERNALLY
```
a[0]  a[1]  a[2]  a[3]  a[4]  ......  a[99]   ---> variable names with unique index
---------------------------------------------
|  0  |  0  |  0  |  0  |  0  | ..... |  0  |  ---> these are the values 
---------------------------------------------
1331   1335   1339  1343  1347 ......  xxxx    ---> these are contiguous addresses
```
[1331] : the first memory address for a[0] is picked by the computer randomly and then other addresses are located followed by the first memory address contiguously.





## INITIALIZING ARRAYS
` int a[10] = {}; `
This will create an array of size 10 and initialize with 0 (*default value for Integers*) for each indices.
```
 a[0]  a[1]  a[2]  a[3]  a[4]  ......  a[9] 
---------------------------------------------
|  0  |  0  |  0  |  0  |  0  | ..... |  0  | 
---------------------------------------------
1331   1335   1339  1343  1347 ......  xxxx 
```



` int a[5] = {10, 20, 30, 40, 50}; `
This will create an array of size 5 and initialize the values given in the curly bracket orderly in each indices.
```
 a[0]   a[1]   a[2]   a[3]   a[4]
------------------------------------
|  10  |  20  |  30  |  40  |  50  |
------------------------------------
1990    1994   1998   2002   2006 
```


` int a[] = {10, 20, 30, 40. 50}; `
If we are initializing the array while declaring then mantioning the size of the array in optional.
```
 a[0]   a[1]   a[2]   a[3]   a[4]
------------------------------------
|  10  |  20  |  30  |  40  |  50  |
------------------------------------
1990    1994   1998   2002   2006 
```

**[KEEP IN MIND]** In C if we are trying to declare an array outside of any block (in global area) then declaring the size of the array in optional. But if we are in declaring array in any block (in local area) then declaring size is mandatory.

```
#include <stdio.h>
int a[]; // this is possible 
int main() {
    int b[]; // this is not possible.
}
```






## ACCESSING ARRAY
For accessing elements of an array we need to use the name of the array and the particular index number which value we want to access.
` int x = a[4]; // i want to access elements that sorted in index no. 4 of 'a' array variable`

We can use loops to access each indivisual indices of an array.
```
#include <stdio.h>
int main() {
    int a[] = {1,3,5,7,9,11}; // declaring and initializing array variable a
    for ( int i =0; i < 6; i++ ) { // using loop iterating over all the indices
        printf ("%d ", a[i]);
    }
}
```


## OPERATIONS ON ARRAYS
Some common operations that can be done on an array are 
- Insertion
- Deletion
- Traversal
- Searching
- Sorting
### INSERTION OPERATION
Say the array is 
```
A[] = [ 4 | 9 | 10 | 89 | 20 |  | ]
```
You want to insert 70 at the index of 2. To perform insertion operation we need to follow these steps
- **Free up** the space / index where you need to insert by shifting all elements from that index into the right side by one.
- **Insert** into the index.
- After inserting 70 into the index 2 array will look like
```
A[] = [ 4 | 9 | 70 | 10 | 89 | 20 ]
```

```
**Algorithm**
/*
Let A be a 1D array with N elements and K is the +ve integer such tat K <= N.
Following is the algorithm where ITEM is inserted into the K-th position of A.
*/
1. Start
2. Set j = N
3. Set N = N + 1
4. While j >= K
5.    Set A[j+1] = A[j]
6.    Set j = j - 1
7. End
8. Set A[K] = ITEM
9. Stop
```

```java
package Easy;

import java.util.Arrays;

public class Insertion {
  public static void main(String[] args) {
    int[] arr = new int[6];
    arr[0] = 4;
    arr[1] = 9;
    arr[2] = 70;
    arr[3] = 10;
    arr[4] = 20;

    System.out.println(Arrays.toString(arr));
    insert(arr, 2, 90);
    System.out.println(Arrays.toString(arr));
  }


  static void insert ( int[] A, int K, int ITEM ) {
    int j = A.length -1;
    while ( j >= K ) {
      A[j] = A[j-1];
      j --;
    }
    A[K] = ITEM;
  }
}
```


### DELETION OPERATION
Say the array is
```
A[] = [ 4 | 9 | 10 | 89 | 20 |  | ]
```
You want to delete 9 at the index of 1. To perform deletion operation we need to follow these steps
- **Free up** the space / index where you need to perform deletion operation by shifting all elements after that index into the left side by one.
- After deleting 9 from index 1 array will look like
```
A[] = [ 4 | 70 | 10 | 89 | 20 |  | ]
```

```
** Algorithm **
/*
Consider A a 1D array with N elements and K is the +ve integer such that K <= N.
Following this algorithm to delete an element avaliable at the K-th position of A.
*/
1. Start
2. Set J = K
3. While J < N
4.    Set LA[j] = LA[j+1]
5.    Set J = J + 1
6. End
7. Set N = N-1
8. Stop
```

```java
package Easy;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 4;
        arr[1] = 9;
        arr[2] = 70;
        arr[3] = 10;
        arr[4] = 20;
        arr[5] = 48;
        System.out.println(Arrays.toString(arr));
        delete(arr, 5);
        System.out.println(Arrays.toString(arr));
    }


    static void delete ( int[] A, int K ) {
        int j = K;
        if ( K == A.length-1 ) {
            A[K] = 0;
        }
        while ( j < A.length-1 ) {
            A[j] = A[j+1];
            j++;
        }
    }
}
```

## TYPES OF ARRAYS 
Arrays are basically two types
- One Dimensional Array (1D array)
- Multi Dimensional Arrays
    - Two Dimensional Array (2D array)
    - Three Dimensional Array (3D array)



# 2D ARRAYS
This array often known as **Matrix** consists of rows and columns.

## DECLARATION OF 2D ARRAY
```java
data-type[][] array-name = new data-type[size][size];
```
- The first dimension is defining the size of rows 
- The second dimension is defining the size of columns.



## MAGIC IS HAPPENING INTERNALLY
A 2D array architecture looks like this 
```java
int[][] A = new int[3][4];
```
```
         col1      col2      col3      col4
          ''        ''        ''        ''
row 1 : A[0][0] | A[0][1] | A[0][2] | A[0][3]
        ________|_________|_________|_________
row 2 : A[1][0] | A[1][1] | A[1][2] | A[1][3]
        ________|_________|_________|_________
row 3 : A[2][0] | A[2][1] | A[2][2] | A[2][3]
```

Can you see ? 
A 2D array is made of by a number of 1D array.
Each row is representing one 1D array and size of column is representing the size of each 1D array. In Matrix style each 1D array have to have same size.


Internally a 2D array will store as the form of 1D array.
Computer can store a 2D array in Row-Order or in Column-Order.

```
Row-Order
A[0][0] | A[0][1] | A[0][2] | A[0][3] | A[1][0] | A[1][1] | A[1][2] | A[1][3] | A[2][0] | A[2][1] | A[2][2] | A[2][3]
|<----------- row 1 ---------------->|  |<-------------- row 2 ------------->|  |<------------ row 3 -------------->|
```

```
Column-Order
A[0][0] | A[1][0] | A[2][0] | A[0][1] | A[1][1] | A[2][1] | A[0][2] | A[1][2] | A[2][2] | A[0][3] | A[1][3] | A[2][3]
|<------- col 1 ---------->|  |<--------- col 2 -------->|  |<--------- col 3 -------->|  |<--------- col 4 ------->|
```



# 3D ARRAYS

## DECLARATION OF 3D ARRAYS
```java
datatype[][][] array-name = new datatype[size][size][size];
```
- First & Second Dimension is defining a 2D array.
- Third Dimension is defining the total number of 2D arrays.
- A 3D array is nothing but a collection of 2D arrays and the total number of collection is defined by the Third Dimension size.
- Each 2D arrays are known as **Page**.
- A 3D array can be imagined as a **Book** where each **Page** of the book is one individual 2D arrays.

```java
int[][][] A = new int[3][4][2];
```
Here [2] is saying that we have two 3x4 matrix.



## A GENERAL EXAMPLE OF DECLARING AND DEFINING AN ARRAY
```java
public class Demo {
  public static void main(String[] args) {
    float[] x;
    x = new float[10];
    
    args = new String[5];
    
    boolean[] isPrime = new boolean[100];
    
    int fib[] = {1,2,3,4,2,1,6};
    
    short[][][] b = new short[4][10][5];
    
    double a[][] = { {1.1 , 2.2}, {3.3, 4.4, 5.5}, null, {6.6, 7.7}, null, {8.8, 9.9, 10.0, 11.3} };
    a[4] = new double[66];
    a[4][65] = 98.23;
    
    Object[] objects = {x, args, isPrime, fib, b, a};
  }
}
```


## EXAMPLE OF TAKING INPUT IN AN ARRAY

```java
import java.util.Scanner;

class Demo {
  public static void main(String[] args) {
    int size = 10;
    int[] arr = new int[size];
    Scanner input = new Scanner(System.in);
    
    for ( int i = 0; i < size; i++ ) {
      System.out.print("Enter "+(i+1)+" th element : ");
      arr[i] = input.nextInt();
    }
  }
}
```