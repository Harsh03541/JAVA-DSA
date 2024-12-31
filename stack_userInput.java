import java.util.Scanner;
import java.util.Stack;

public class stack_userInput {
    
    public static void reverse(Stack<Integer>  st) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of element : ");
        n = sc.nextInt();
        System.out.println("Enter elements in stack : ");
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
