/*
    *****
   *****
  *****
 *****
*****
 */


public class Pattern1 {
    public static void main(String[] args) {
        int N = 5;
        for ( int row = 0; row < N; row++ ) {
            for ( int space = 0; space < N-row-1; space++ ) {
                System.out.print(" ");
            }

            for ( int star = 0; star < N; star++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
