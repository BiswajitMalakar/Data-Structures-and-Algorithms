# ARRAYS

**An array is a collection of elements of the *same type* placed in *contiguous memory locations* that can be *individually referenced by using an index* to a unique identifier.**





## DECLARATION OF ARRAYS
Format :
``` datatype array_name [size]; ```

[datatype] : datatype can be any primtive datatype like int, float, double, char, bool etc.

[array_name] : this is any user given name that must follow basic namming rules.

[size] : it must be +ve and should be in the range of integer number.


Example : 
``` int a[100]; ```


### MAGIC IS HAPPENING INTERNALLY!
 a[0]  a[1]  a[2]  a[3]  a[4]  ......  a[99]   ---> variable names with unique index
---------------------------------------------
|  0  |  0  |  0  |  0  |  0  | ..... |  0  |  ---> these are the values 
---------------------------------------------
1331   1335   1339  1343  1347 ......  xxxx    ---> these are contiguous addresses


[1331] : the first memory address for a[0] is picked by the computer randomly and then other addresses are located followed by the first memory address contiguously.





## INITIALIZING ARRAYS
``` int a[10] = {}; ```
This will create an array of size 10 and initialize with 0 (*default value for Integers*) for each indices.

 a[0]  a[1]  a[2]  a[3]  a[4]  ......  a[9] 
---------------------------------------------
|  0  |  0  |  0  |  0  |  0  | ..... |  0  | 
---------------------------------------------
1331   1335   1339  1343  1347 ......  xxxx 




``` int a[5] = {10, 20, 30, 40, 50}; ```
This will create an array of size 5 and initialize the values given in the curly bracket orderly in each indices.

 a[0]   a[1]   a[2]   a[3]   a[4]
------------------------------------
|  10  |  20  |  30  |  40  |  50  |
------------------------------------
1990    1994   1998   2002   2006 



``` int a[] = {10, 20, 30, 40. 50}; ```
If we are initializing the array while declaring then mantioning the size of the array in optional.

 a[0]   a[1]   a[2]   a[3]   a[4]
------------------------------------
|  10  |  20  |  30  |  40  |  50  |
------------------------------------
1990    1994   1998   2002   2006 


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
``` int x = a[4]; // i want to access elements that sorted in index no. 4 of 'a' array variable```

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