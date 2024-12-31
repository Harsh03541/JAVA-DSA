public class starPyramid {
    public static void main(String[] args) {
        
        int rows = 3;
        int nstr = rows;
        int nsps = 1;
        for (int i = 1; i <= 2*rows + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= nsps; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }
            nstr--;
            nsps += 2;
            System.out.println(); 
        }
    }
}