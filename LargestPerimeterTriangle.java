//LargestPerimeterTriangle
import java.util.Arrays;
public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        for(int i = l-1; i > 1; --i) {
            if(nums[i] < nums[i-1] + nums[i-2])
                return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }

    public static void main(String[] args) {
       int [] nums = {3,6,2,3};
       int res = largestPerimeter(nums);
       System.out.println(res);
    }
}