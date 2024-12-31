
public class sum {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{5,6,7,8,2},{1,2,3,4,5},{4,5,6,7,8},{7,5,4,3,2}};
        int sum =0;
        for (int i = 0; i < 5; i++) {
            for(int j =0; j < 5; j++){
                if((i!=j) && ((i+j) != 4)){
                    sum +=a[i][j];
                }
            }
            
        }
        System.out.print(sum);
    }
}
