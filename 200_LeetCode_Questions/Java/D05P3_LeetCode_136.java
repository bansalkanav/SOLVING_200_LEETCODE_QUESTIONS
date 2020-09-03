// Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
// Memory Usage: 40.5 MB, less than 66.95% of Java online submissions for Single Number.

class Solution {
    public int singleNumber(int[] nums) {
        int output = 0;
        for(int num : nums){
            output ^= num;
        }
        return output;
    }
}
