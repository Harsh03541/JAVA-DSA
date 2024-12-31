import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(13);
        st.push(10);
        st.push(55);
        st.push(30);
        System.out.println(st);         // [1, 23, 13, 10, 55, 30]
        System.out.println("Peak element in stack : " + st.peek());     // Peak element in stack : 30
        System.out.println("Size of stack : " + st.size());             // Size of stack : 6
        st.pop();
        System.out.println("Peek element after pop an element : " + st.peek());     // Peek element after pop an element : 55
        System.out.println("Size of stack after pop an element : " + st.size());    // Size of stack after pop an element : 5
        
    }
}
