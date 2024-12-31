public class alphabetPattern {
    public static void main(String[] args) {
        
        int row = 4;
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
                int a = 1;
            for(int k = 1; k <= 2*i - 1; k++) {
                int d = a + 64;
                char ch = (char)d;
                System.out.print(ch);
                a++;
            }
            System.out.println();
        }
    }
}