import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(Stack<Integer> st, int x) {
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if(st.size() == 1)      return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);         // [1, 2, 3, 4, 5, 6]
        System.out.println(st.peek());
        reverse(st);
        System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while (st.size() > 0) {
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);         // [6, 5, 4, 3, 2, 1]
        // Stack<Integer> qt = new Stack<>();

        // while (rt.size() > 0) {
        //     qt.push(rt.pop());
        // }
        // System.out.println(qt);         // [1, 2, 3, 4, 5, 6]
        // while (qt.size() > 0) {
        //     st.push(qt.pop());
        // }
        // System.out.println(st);         // [6, 5, 4, 3, 2, 1]
    }
}
