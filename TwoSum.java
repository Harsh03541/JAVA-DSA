import java.util.HashMap;

public class TwoSum {
    public static int[] SolutionTwoSum(int[] nums, int target) {
        int [] ans = {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        // element, index
        for(int i = 0; i < nums.length; i++) {
            int partner = target - nums[i];
            if(mp.containsKey(partner)) {
                ans = new int[] {i, mp.get(partner)};
                return ans;
            }
            mp.put(nums[i], target);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,5,7,-1};
        int target = 6;
        int []res= SolutionTwoSum(nums, target);
        System.err.println("res : " + res);
    }
}