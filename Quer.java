import java.util.*;

public class Quer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter size of matrix: ");
        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        System.out.println("Enter no. of queries: ");
        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.println("Enter 3 values of array for operation ");
            int a[] = new int[3];
            for (int j = 0; j < 3; j++) {
                a[j] = sc.nextInt();
            }

            if (a[0] == 1) {

                for (int k = 0; k < n; k++) {
                    mat[a[1]][k] = a[2];

                }
            } else {
                for (int k = 0; k < n; k++) {
                    mat[k][a[1]] = a[2];
                }
            }
        }
        for (int p = 0; p < n; p++) {
            for (int r = 0; r < n; r++) {
                sum = sum + mat[p][r];
            }
        }

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
