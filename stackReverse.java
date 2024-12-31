import java.util.Stack;

public class stackReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);         // [1, 2, 3, 4, 5, 6]

        Stack<Integer> gt = new Stack<>();

        while (st.size() > 0) {
            gt.push(st.pop());      // st stack me se gt stack me element push honge or st stack ke element 
        }
        System.out.println(gt);         // [6, 5, 4, 3, 2, 1]
        System.out.println(st);        // []

        // reverse ko vaaps se reverse karnaa...
        Stack<Integer> rt = new Stack<>();

        while (gt.size() > 0) {
            rt.push(gt.pop());   
        }
        System.out.println(rt);         // [1, 2, 3, 4, 5, 6]
    }
}