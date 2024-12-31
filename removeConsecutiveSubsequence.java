// import stack_Implementation.Stack;

import java.util.*;
public class removeConsecutiveSubsequence {

    public static int[] remove(int[] arr) {
        int n = arr.length;
        
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            if(st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);

            else if(arr[i] == st.peek()) {
                if (i ==  n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
            int [] res = new int[st.size()];
            int m = res.length;

            for(int j = m - 1; j >= 0; j--) {
                res[j] = st.pop();
            }
            return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,10,10,10,4,4,4,4,5,7,7,2};
        int [] res = remove(arr);
        
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}