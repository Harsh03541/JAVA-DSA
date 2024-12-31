public class bubbleSort {
    public static void main(String[] args) {
        
        int arr[] = {5,6,8,6,2,31,0};
        
        for (int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
            if(arr[j] > arr[j+1] ) {
                int temp = arr[j];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }

            }
            
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }    
}