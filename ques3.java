import java.util.*;
public class ques3{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern:");

        String pattern = sc.nextLine();
        char pattern_array[] = pattern.toCharArray();

        System.out.println("Enter string:");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        Map<Character,String> map = new HashMap<>();
        int i =0; 
        
        for(var e : pattern_array){

            if(!map.containsKey(e)){

                map.put(e,words[i]);
                i++;
            }
            else{
                if(!map.get(e).equals(words[i])){

                    System.out.println("false");
                    return;
                }
                else{
                    i++;
                }
            }
        }
        System.out.println("true");
        
    }
}