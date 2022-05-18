import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JCFDemo1 {
    public static void main(String[] args) {

        /*
        boolean add(Object obj)
        boolean addAll(Collection<? extends T> c)
        void add(int index, Object obj)
        boolean equals(Collection<? extends T)
        void clear()
        int size()
        boolean contains(Object obj)
        Object clone()
        Object[] toArray()
        Object remove(int index)
        Object set(int index, Object obj)
        Object get(int index)
         */


        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(56);
        temp.add(900);
        ArrayList<Integer> list = new ArrayList<>(temp);
        list.add(0,78); // Return type void

        Object cloned = list.clone(); // Return type Object
        System.out.println(cloned.toString());

        Object[] arr = list.toArray(); // Return type Object[]
        System.out.println(Arrays.toString(arr));

        System.out.println(list.add(88)); // Return type boolean
        System.out.println(list.addAll(temp)); // Return type boolean
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(780));

        System.out.println(list.get(2)); // Return type Object

        // set(int index, E object) this method replacing the new object with the already existing object at the index of index
        System.out.println(list.set(2, 9000));

        // add(int index, E object) this method is placing the new object at the index and shifting others at the right index.
        list.add(2, 50000); // Return type void
        System.out.println(list.toString());

        System.out.println(list.remove(2)); // Return type Object

        System.out.println(list.equals(temp)); // Return type boolean

        System.out.println(list);

        list.clear(); // Return type void // clear all elements

    }
}
