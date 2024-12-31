
import java.util.*;

public class ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        String numStr = String.valueOf(n);

        int[] digits = new int[numStr.length()];
        int i = digits.length - 1;
        while (n > 0) {
            digits[i] = n % 10;
            i--;
            n = n / 10;

        }

        int sum = 0;
        for (int p = 0; p < digits.length; p++) {
            for (int q = p + 2; q < digits.length; q++) {
                if (digits[p] + digits[q] >= sum) {
                    sum = digits[p] + digits[q];
                }
            }
        }
        System.out.print(sum + " ");

    }
}
