public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for(Integer i=0; i<n; i++) {
            max_ending_here += nums[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if(max_ending_here < 0) {
                max_ending_here = 0; 
            } 
        }
        return max_so_far;
    }

    public static int minSubArray(int[] nums) {
        int n = nums.length;
        int min_so_far = Integer.MAX_VALUE, min_ending_here = 0;
        for(Integer i=0; i<n; i++) {
            min_ending_here += nums[i];
            if(min_so_far < min_ending_here)
                min_so_far = min_ending_here;
            if(min_ending_here < 0)
            min_ending_here = 0;
        }
        return min_so_far;
    }

    public static void main(String[] args) {
        int [] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contagious sum is: " +maxSubArray(nums));
    }
}