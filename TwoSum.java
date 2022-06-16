public class TwoSum {
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int res = twoSum(nums, target);
        System.out.println("====" +res);
>>>>>>> 3bcbcd7ff2f7fc996ec96acf53c90df83ea0e4b6
    }
}