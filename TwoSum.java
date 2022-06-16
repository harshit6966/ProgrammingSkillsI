public class TwoSum {
    public int[] tagetSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.lenght; j++) {
                int complement = target - nums[i];
                if(nums[j] == complement) {
                    return new int[] { i , j };
                }
            }
        }
        throw IllegalArgumentException("No match found");
    }
}