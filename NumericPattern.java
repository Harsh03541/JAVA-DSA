import java.util.Scanner;
public  class NumericPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");

        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {

            for(int j = 1; j <= row; j++) {

                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("2 ");
                }
            }

            System.out.println();
        }
    }
}