import java.util.Arrays;

public class MergeSortedArray {
    public void merge_sorted_array(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++) {
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int m = 3 , n = 3;
        int[] a = new int[m + n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = {2 , 6 , 7};
        merge(a , m , b , n);
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i] + " ");
    }

    private static void merge(int[] a, int m, int[] b, int n) {
    }
}
