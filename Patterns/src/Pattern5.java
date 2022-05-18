/*
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
 */


public class Pattern5 {
    public static void main(String[] args) {
        int N = 5;
        // this is for the upper half of the pattern.
        for ( int row = 1 ; row <= N; row ++ ) {
            // if it is 1st row then take a special care.
            if ( row == 1 ) {
                System.out.print("*");
                for ( int space = 1; space <= (N-row)*2; space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            // if it is not the 1st row then do the following
            else {
                // this is for the left half of the upper half
                System.out.print("*");
                for ( int space = 1; space <= (row-2); space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");

                // this is for the space between the left and right half of the upper half
                for ( int space = 1; space <= (N-row)*2; space ++ ) {
                    System.out.print(" ");
                }

                // this is for the right half of the upper half.
                System.out.print("*");
                for ( int space = 1; space <= (row-2); space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // when row os finished printing then print a new line.
            System.out.println();
        }


        // this is for the lower half
        for ( int row = N; row >= 1; row -- ) {
            // if it is 1st row then take a special care.
            if ( row == 1 ) {
                System.out.print("*");
                for ( int space = 1; space <= (N-row)*2; space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            // if it is not the 1st row then do the following
            else {
                // this is for the left half of the lower half
                System.out.print("*");
                for ( int space = 1; space <= (row-2); space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");

                // this is for the space between the left and right half of the lower half
                for ( int space = 1; space <= (N-row)*2; space ++ ) {
                    System.out.print(" ");
                }

                // this is for the right half of the lower half.
                System.out.print("*");
                for ( int space = 1; space <= (row-2); space ++ ) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            // when row os finished printing then print a new line.
            System.out.println();
        }
    }
}
