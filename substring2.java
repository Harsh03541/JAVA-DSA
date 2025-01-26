public class substring2 {
    public static void main(String[] args) {
        String s = "babad";
        String sub = getSubstring(s, 1, 3); // Extract substring from index 1 to 3
        System.out.println("Substring: " + sub); // Output: "aba"
    }

    public static String getSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
