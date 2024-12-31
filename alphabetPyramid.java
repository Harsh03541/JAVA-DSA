public class alphabetPyramid {
    public static void main(String[] args) {
        
        int rows = 3;
        int nstr = rows;
        int nsps = 1;
            int a = 1;
        for (int i = 1; i <= 2*rows + 1; i++) {
            int d = a + 64;
            char ch = (char)d;
            System.out.print(ch);
            a++;
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            a = 1;
            for (int j = 1; j <= nstr; j++) {
                int d = a + 64;
            char ch = (char)d;
            System.out.print(ch);
            a++;
            }
            for(int k = 1; k <= nsps; k++) {
                System.out.print(" ");
                a++;
            }
            for(int j = 1; j <= nstr; j++) {
                int d = a + 64;
            char ch = (char)d;
            System.out.print(ch);
            a++;
            }
            nstr--;
            nsps += 2;
            System.out.println(); 
        }
    }
}