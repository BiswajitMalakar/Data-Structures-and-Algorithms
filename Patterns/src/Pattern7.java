/*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */


public class Pattern7 {
    public static void main(String[] args) {
        int N = 5;
        int X = 1;
        for ( int row = 1; row <= N; row ++ ) {
            for ( int space = 1; space <= N-row; space ++ ) {
                System.out.print(" ");
            }

            int temp = X;
            while ( temp > 0 ) {
                System.out.print(temp%10+" ");
                temp /= 10;
            }

            X *= 11;
            System.out.println();
        }
    }

}
