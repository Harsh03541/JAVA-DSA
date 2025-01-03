import java.util.Stack;

public class prefix_Evaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val  = new Stack<>();

        // ulta loop chalega or v1 phle peek element hoga or fir v2 -> v1 ke baad wala peek hogaa...

        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            }

            else {
                int v1 = val.pop();
                int v2 = val.pop();

                if(ch == '+')   val.push(v1 + v2);
                if(ch == '-')   val.push(v1 - v2);
                if(ch == '*')   val.push(v1 * v2);
                if(ch == '/')   val.push(v1 / v2);
            }
        }
        System.out.println(val.peek());
    }
}