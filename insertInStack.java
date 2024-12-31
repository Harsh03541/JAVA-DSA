import java.util.Stack;

// Insert at any index in stack 
public class insertInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);         // [1, 2, 3, 4, 5, 6]

        int idx = 2;
        int val = 88;
        Stack<Integer> temp = new Stack<>();        // create new stack temp

        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
