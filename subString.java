public class subString {
    public static void main(String[]args) {

        String str = "harsh";
        int len = str.length();

        System.err.println("Substring of the given string : ");

        for (int i = 0; i < len; i++) {

            for (int j = 0; j <= i; j++) {

                char ch = str.charAt(j);

                System.err.print(ch);
            }

            System.err.println();
        }
    }
}