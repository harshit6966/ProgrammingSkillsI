import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int l = nums.length;
        for(int i=0; i<l; i++) {
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,6,8};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}