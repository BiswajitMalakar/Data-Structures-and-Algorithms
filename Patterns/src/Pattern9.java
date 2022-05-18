/*
1111
222
33
4
 */


public class Pattern9 {
    public static void main(String[] args) {
        int N = 4;
        for ( int row = 1; row <= N; row ++ ) {
            for ( int print = 1; print <= (N-row)+1; print ++ ) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}
