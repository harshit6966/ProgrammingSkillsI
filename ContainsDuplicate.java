public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums [] = {1,1,2,2,3,6,8};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}