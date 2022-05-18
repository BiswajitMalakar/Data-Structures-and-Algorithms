/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */

public class Pattern8 {
    public static void main(String[] args) {
        int N = 5;
        for ( int row = 1; row <= N; row ++ ) {
            for ( int space = 1; space <= N-row; space ++ ) {
                System.out.print(" ");
            }

            for ( int print = 1; print <= row; print ++ ) {
                System.out.print(print+" ");
            }

            System.out.println();
        }
    }
}
