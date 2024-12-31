import java.util.*;
public class balancedBrakets {

    public static boolean isBalanced(String str) {
        
        Stack<Character> st = new Stack<>();
        int n = str.length();  
         
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            
            if(ch == '(') {
                st.push(ch);
                cnt++;
            }
            else {  // if ch == ')'
                if (st.size() == 0) {
                    cnt++;
                    return false;
                }      
                if(st.peek() == '(')    st.pop();
            }
        }
        if(st.size() > 0)       return  false;
        else    return true;   
        
    }
    public static void main(String[] args) {

        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}

balancedBracketsCounter