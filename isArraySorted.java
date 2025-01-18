class isArraySorted { 
    public static boolean isSortedArray(int[]arr) {
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] >= temp) {
               temp = arr[i];
            }
            else {
                return false;
            }
        }
            return true;  
    }
    public static void main(String[] args) {
        // int [] nums = {2,5,6,2,8,6,3,25,23};         // false
        int [] nums = {11,12,33,66,88,94,96,99};        // true
        
        // int result = secondLagest(nums);
        System.err.println("Is given array is sorted or not (True/False) : " + isSortedArray(nums));
    }
}