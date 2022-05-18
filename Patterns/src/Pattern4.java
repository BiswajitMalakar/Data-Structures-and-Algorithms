/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
 */


public class Pattern4 {
    public static void main(String[] args) {
        int N = 4;
        for ( int row = 1; row <= N; row++ ) {
            for ( int space = 1; space <= N-row; space++) {
                System.out.print(" ");
            }

            for ( int star = 1; star <= (2*row)-1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for ( int row = N; row >= 1; row -- ) {
            for ( int space = 1; space <= (N-row); space ++ ) {
                System.out.print(" ");
            }

            for ( int star = 1; star <= (2*row)-1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
