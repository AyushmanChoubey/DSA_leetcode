class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            int index = search(j, nums, i);
            if (index != -1) {
                return new int[] { i, index }; // return only two indices
            }
        }
        return new int[] {}; // no solution found
    }

    public int search(int value, int[] nums, int excludeIndex) {
        for (int k = 0; k < nums.length; k++) {
            if (k != excludeIndex && nums[k] == value) {
                return k;
            }
        }
        return -1; // not found
    }
}
