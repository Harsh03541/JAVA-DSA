
public class sortArray {
    public static void move(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                
                i = -1;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}
