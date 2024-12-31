import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {

        // String infix = "((2+3)*(5-2))";
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix : " + infix);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                val.push(s);

            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);

                    op.pop();
                }
                op.pop(); // '(' hata diya
            } else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.peek();
                    String t = v1 + v2 + o;
                    val.push(t);

                    op.pop();
                    
                    // push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);

                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else {
                        op.push(ch);
                    }
                }
            }
        }
        while (val.size() > 1) {
            // work
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.peek();
            String t = v1 + v2 + o;
            val.push(t);
            op.pop();
        }

        // String postfix = val.peek();
        // System.out.println(postfix);
        System.out.println(val.peek());
    }
}