// Runtime: 1 ms, faster than 73.90% of Java online submissions for Maximum Product of Two Elements in an Array.
// Memory Usage: 39.3 MB, less than 52.34% of Java online submissions for Maximum Product of Two Elements in an Array.

class Solution {
    public int maxProduct(int[] nums) {
        java.util.Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
