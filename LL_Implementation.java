import java.util.Stack;

public class LL_Implementation {
    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class LLStack {

        private Node head = null;
        private int size = 0;

        void push(int val) {    
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayrec(Node h) {
            if(h == null)       return;
            displayrec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next; 
            }
            System.out.println();
        }
        
        int size() {        // getter
            return size;
        }

        int pop() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek() {
            if(head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty() {
            if(size == 0) 
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {

        LLStack st = new LLStack();
        st.push(1);
        st.display();

        st.push(2);
        st.display();

        st.push(3);
        st.display();
        
        st.push(4);
        System.out.println("size : " + st.size());
        st.display();
        
        System.out.println("size : " + st.size());
        st.display();

        st.displayRev();

        st.pop();
        st.display();
        
        System.out.println("size : " + st.size());

    }
}
