// Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 39.1 MB, less than 98.18% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum < 0) ? nums[i] : sum + nums[i];
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
}
