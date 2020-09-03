// Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
// Memory Usage: 40.3 MB, less than 54.52% of Java online submissions for Missing Number.

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return (nums.length * (nums.length + 1) / 2) - sum;
    }
}
