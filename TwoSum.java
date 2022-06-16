import java.util.Arrays;

public class TwoSum {
    public static int[] targetSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No match found");
    }
    public static void main(String[] args) {
        int[] nums = {0,7,2,15};
        int target = 9;
        System.out.println(Arrays.toString(targetSum(nums, target)));
    }
}