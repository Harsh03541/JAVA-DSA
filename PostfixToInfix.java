import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {

        String str = "953+4*6/-";
        System.out.println("Postfix : " + str);
        Stack<String> val = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if(ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            }
            else {
                String v2 = val.pop();
                String v1 = val.pop();

                char o = ch;
                String t = '(' + v1 + o + v2 + ')';
                val.push(t);
            }
        }
        System.out.println("Infix : " + val.peek());
    }
}
