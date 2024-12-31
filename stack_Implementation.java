public class stack_Implementation {

    public static class Stack {
        private int[] arr = new int[50];
        private int idx = 0;        // vvvv. important

        void push(int x) {
            if(isFull()) {
                System.out.println("Stack is full");
            }
            arr[idx] = x;
            idx++;
        }
        int peak() {
            if(idx == 0) {
                System.out.println("Stack is full");
                return -1;
            }
            return arr[idx - 1];
        }
        int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }
        void display() { 
            for(int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size() {
            return  idx;
        }
        boolean  isEmpty() {
            if(idx == 0)    return true;
            else    return false;
        }
        boolean isFull() {
            if(idx == arr.length)       return true;
            else        return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();

        st.push(2);
        st.display();

        st.push(3);
        st.display();
        
        st.push(4);
        st.display();
        
        System.out.println("size : " + st.size());
        st.pop();
        st.pop();
        System.out.println("size :: " + st.size());
        st.display();
    }
}