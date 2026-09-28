class Solution {
    public int maximumCount(int[] nums) {
        int max_count = 0;
        int min_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                min_count++;
            }

            if (nums[i] > 0) {
                max_count++;
            }
        }

        return Math.max(max_count, min_count);
    }
}