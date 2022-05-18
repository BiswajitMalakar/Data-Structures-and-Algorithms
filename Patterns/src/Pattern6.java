/*
    *****
   *   *
  *   *
 *   *
*****
 */


public class Pattern6 {
    public static void main(String[] args) {
        int N = 5;
        for ( int row = 1; row <= N; row ++ ) {
            for ( int space = 1; space <= N-row; space++ ) {
                System.out.print(" ");
            }

            // printing the stars
            if ( row == 1 || row == N ) {
                for ( int star = 1; star <= N; star ++ ) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                System.out.print("   ");
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
