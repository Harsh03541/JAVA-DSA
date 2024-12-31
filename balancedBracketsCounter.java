// import java.util.*; 

// public class balancedBracketsCounter {

//     public static int minRemovalsToBalance(String str) {
//         Stack<Character> stack = new Stack<>();
//         int removalCount = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == '(') {
//                 stack.push(ch);
//             } 
//             else if (ch == ')') {
//                 if (!stack.isEmpty() && stack.peek() == '(') {
//                     stack.pop(); // Balanced pair, no removal needed
//                 } else {
//                     removalCount++; // Unmatched closing bracket
//                 }
//             }
//         }

//         // Add remaining unmatched opening brackets
//         removalCount += stack.size();

//         return removalCount;
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter the string: ");
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         sc.close();

//         System.out.println("Minimum removals to balance: " + minRemovalsToBalance(str));
//     }
// }







import java.util.*;
public class balancedBracketsCounter {

    public static int isBalanced(String str) {
        
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
                    
                }      
                if(st.peek() == '(')    st.pop();
            }
        }
        if(st.size() > 0)       return  cnt;
        else    return cnt;   
        
    }
    public static void main(String[] args) {

        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int res = isBalanced(str);
        System.out.println("res : " + res);
    }
}

