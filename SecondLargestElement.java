class SecondLargestElement {
    public static int secondLagest(int[]arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > smax) {
                smax = arr[i];
            }
        }
            return smax;  
    }
    public static void main(String[] args) {
        int [] nums = {2,5,6,2,8,6,3,25,23};
        int result = secondLagest(nums);
        System.err.println("Second largest element from an array : " + result);
    }
}