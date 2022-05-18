package Easy;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] A = {1,2,3,5,9};
        int[] B = {1,3,9};
        System.out.println(intersection(A, B));
    }


    static ArrayList<Integer> intersection (int[] A, int[] B ) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while ( i < A.length && j < B.length ) {
                if ( A[i] == B[j] ) {
                    list.add(A[i]);
                    i++;
                    j++;
                }
                else if ( A[i] < B[j] ) {
                    i++;
                }
                else {
                    j++;
                }
        }

        return list;
    }
}
