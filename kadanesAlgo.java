public class kadanesAlgo {
    public static int maximum(int a, int b) {
        if(a > b) 
            return a;
        return b;
    }
    public static int maxSubArray(int arr[]) {
        int sum = 0;
        int maxi = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxi = maximum(sum,maxi);

            if(sum < 0)
                sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr);
        System.out.println("Maximum sum : " + result);
    }
}