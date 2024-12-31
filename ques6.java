
import java.util.*;

public class ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dictionary (space-separated):");
        String dic = sc.nextLine();

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] dicArray = dic.split(" ");
        String[] sentArray = sentence.split(" ");

        for (int j = 0; j < sentArray.length; j++) {
            String word = sentArray[j];

            for (String prefix : dicArray) {
                if (word.startsWith(prefix)) {
                    sentArray[j] = prefix;
                    break;
                }
            }
        }

         for(int i = 0; i < sentArray.length; i++) {
            System.out.print(sentArray[i] + " ");
        }
    }
}
