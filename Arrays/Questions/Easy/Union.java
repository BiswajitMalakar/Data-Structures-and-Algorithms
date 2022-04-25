package Questions.Easy;
import java.util.ArrayList;
import java.util.Arrays;


public class Union {
    public static void main(String[] args) {
        System.out.println(union(new int[]{10,-1,1,2,3,4,5,9}, new int[]{-4,1,2,3,6,11,4,15}));
    }



    static ArrayList<Integer> union ( int[] a, int[] b ) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        // if array is not sorted then sort the array
        Arrays.sort(a);
        Arrays.sort(b);
        
        // idea is
        // take the one which is small and increament the index
        // If both same then take any one and increment both indeces.
        while ( i < a.length || j < b.length ) {
            if ( i < a.length && j < b.length ) {
                if ( a[i] < b[j] ) {
                    ans.add(a[i]);
                    i++;
                }
                else if ( a[i] > b[j] ) {
                    ans.add(b[j]);
                    j++;
                }
                else {
                    ans.add(a[i]);
                    i++;
                    j++;
                }
            }
            else if ( i < a.length && j >= b.length ) {
                ans.add(a[i]);
                i++;
            }
            else {
                ans.add(b[j]);
                j++;
            }
        }

        return ans;
    } 
}
