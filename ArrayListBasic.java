import java.util.*;

public class ArrayListBasic {
    public static void main(String[]args) {
        // wrapper class
        Integer i = Integer.valueOf(4);
        Float f = Float.valueOf(10.52f);
        System.out.println(i);      // 4
        System.out.println(f);      // 10.52

        // create arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(2);
        l1.add(9);

        // to get an elemet at index
        System.out.println(l1.get(2));  // 7

        // print using loop
        for (int j = 0; j < l1.size(); j++) {
            System.out.print(l1.get(j) + " ");      // 5 6 7 4 2 9
            
        }

        // print the arraylist directly
        System.out.println(l1);        // [5, 6, 7, 4, 2, 9]

        // adding element at some index [ --> l1.add(indexNo, value to be inserted at that index) ]
        l1.add(1, 100);
        System.out.println(l1);         // [5, 100, 6, 7, 4, 2, 9]

        // modifying element at index  [ --> l1.set(indexNo, value to be replace at that index) ]
        l1.set(1, 88); // -> replace the value at given idx.
        System.out.println(l1);     // [5, 88, 6, 7, 4, 2, 9]

        // remove an element at idx     [ --> l1.remove(indexNo) ]
        l1.remove(0); // remove an element at given idx 
        System.out.println(l1);     // [88, 6, 7, 4, 2, 9]
        

        // remove an element from the arraylist 
        l1.remove(Integer.valueOf(2));  // -> isko thoda shi se dekhe. [-- l1.remove(Integer.valueOf(VAL))]
        System.err.println(l1);         // [88, 6, 7, 4, 9]

        System.err.println(l1.remove(Integer.valueOf(6)));      // true
        System.err.println(l1.remove(Integer.valueOf(151)));    // false
        




    }
}