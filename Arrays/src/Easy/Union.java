package Easy;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int[] A = {1,3,5,7,9,12, 14};
        int[] B = {1,2,4,6,8,10,12};
        System.out.println(union(A, B));
    }

    static ArrayList<Integer> union (int[] A, int[] B ) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while ( i < A.length || j < B.length ) {
            if ( i < A.length && j < B.length ) {
                if ( A[i] == B[j] ) {
                    list.add(A[i]);
                    i++;
                    j++;
                }
                else if ( A[i] < B[j] ) {
                    list.add(A[i]);
                    i++;
                }
                else {
                    list.add(B[j]);
                    j++;
                }
            }
            else {
                if ( i < A.length ) {
                    list.add(A[i]);
                    i++;
                }
                else {
                    list.add(B[j]);
                    j++;
                }
            }
        }

        return list;
    }
}
