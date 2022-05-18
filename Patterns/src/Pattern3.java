/*
    1
   2 1 2
  3 2 1 2 3
 4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */

public class Pattern3 {
    public static void main(String[] args) {
        int N = 5;
        // printing rows
        for ( int row = 1; row <= N; row ++ ) {
            // for each row printing spaces
            for ( int space = 0; space < N-row; space ++ ) {
                System.out.print(" ");
            }

            // printing numbers
            if ( row == 1 ) // if row is 1 then print 1
                System.out.print("1 ");
            else { // otherwise
                int temp = row;
                // print the left half side
                while ( temp > 1 ) {
                    System.out.print(temp+" ");
                    temp--;
                }
                // print the middle 1
                System.out.print("1 ");
                temp = 2;
                // print the right half size
                while ( temp <= row) {
                    System.out.print(temp+" ");
                    temp ++;
                }
            }
            // when spaces and numbers are printed then print the new line
            System.out.println();
        }
    }

}

