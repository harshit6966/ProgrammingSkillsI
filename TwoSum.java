public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for(int i=0; i<l-1; i++) {
            for(int j=i+1; j<l-1; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[]{i+1, j+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int res = twoSum(nums, target);
        System.out.println("====" +res);
    }
}