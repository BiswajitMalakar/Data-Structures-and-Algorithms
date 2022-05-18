/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */

public class Pattern2 {
    public static void main(String[] args) {
        int N = 5;
        for ( int row = 1; row <= N; row ++ ) {
            for ( int space = 0; space < N - row; space ++ ) {
                System.out.print(" ");
            }

            for ( int print = 0; print < row; print++ ) {
                System.out.print(row+" ");
            }

            System.out.println();
        }
    }
}
