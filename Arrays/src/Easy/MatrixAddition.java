package Easy;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = {
                        {1,2,3},
                        {4,5,6},
                    };

        int[][] B = {
                        {1,3,5},
                        {7,9,11},
                    };

        int[][] Ans = addMatrices(A, B);

        for ( int i = 0; i < Ans.length; i++ ) {
            System.out.println(Arrays.toString(Ans[i]));
        }
    }


    static int[][] addMatrices ( int[][] A, int[][] B ) {
        int[][] Ans = new int[A.length][A[0].length];

        if ( A.length == B.length && A[0].length == B[0].length ) {
            for ( int i = 0; i < A.length; i++ ) {
                for ( int j = 0; j < A[i].length; j++ ) {
                    Ans[i][j] = A[i][j] + B[i][j];
                }
            }
        }
        else {
            System.out.println("Order of tow Matrices should be same!");
        }

        return Ans;
    }
}
