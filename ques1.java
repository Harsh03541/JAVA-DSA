import java.util.*;
public class ques1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        int current_digit = 1;
        int tr = 0;
        int br = r-1;
        int lc =0;
        int rc = c-1;
        int total_elements = r*c;
        int n =1;

        // like spiral matrix
        while(n<total_elements){

            for(int i = lc; i<= rc && n<total_elements; i++){
                arr[tr][i] = current_digit;
                n++;
            }
            tr++;

            for(int i = tr; i<= br && n<total_elements; i++){
                arr[i][rc] = current_digit;
                n++;
            }
            rc--;

            for(int i = rc; n<total_elements && i>= lc ; i--){
                arr[br][i] = current_digit;
                n++;
            }
            br--;

            for(int i = br; i>= tr && n<total_elements; i--){
                
                arr[i][lc] = current_digit;
                n++;
                
            }
            lc++;
            
            if(current_digit==1){
                current_digit=0;
            }else{
                current_digit=1;
            }

        }

        for(int i = 0; i < r; i++){
            for(int j =0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}