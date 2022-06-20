import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer,Integer> map = new HashMap();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if(count > 0) {
                list.add(num);
                map.put(num, count-1);
            }
        }

        int[] result = new int[list.size()];
        int i = 0;
        for(int num : list) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII ist = new IntersectionOfTwoArraysII();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4}; 
        System.out.println(Arrays.toString(ist.intersect(nums1, nums2)));
    }
}
