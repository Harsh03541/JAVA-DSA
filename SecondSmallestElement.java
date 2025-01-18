class SecondSmallestElement {
    public static int secondSmallest(int[]arr) {
        int small = Integer.MAX_VALUE;
        int secondSmaller = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < small) {
                secondSmaller = small;
                small = arr[i];
            }
            else if(arr[i] != secondSmaller && arr[i] < secondSmaller) {
                secondSmaller = arr[i];
            }
        }
            return secondSmaller;  
    }
    public static void main(String[] args) {
        int [] nums = {2,5,6,2,8,6,3,25,18};
        int result = secondSmallest(nums);
        System.err.println("Second smallest element from an array : " + result);
    }
}