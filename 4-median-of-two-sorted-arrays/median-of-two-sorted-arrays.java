import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Merge arrays
        int[] mergedArray = new int[nums1.length + nums2.length];
        int index = 0;

        for (int num : nums1) {
            mergedArray[index++] = num;
        }
        for (int num : nums2) {
            mergedArray[index++] = num;
        }

        // Step 2: Sort merged array
        Arrays.sort(mergedArray);

        // Step 3: Find median
        int n = mergedArray.length;
        if (n % 2 == 0) {
            int mid1 = n / 2;
            int mid2 = mid1 - 1;
            return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        } else {
            int mid = n / 2;
            return mergedArray[mid];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(sol.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}
