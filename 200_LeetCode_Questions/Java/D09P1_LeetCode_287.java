// https://leetcode.com/problems/find-the-duplicate-number/
// Runtime: 2 ms, faster than 50.06% of Java online submissions for Find the Duplicate Number.
// Memory Usage: 39.9 MB, less than 15.35% of Java online submissions for Find the Duplicate Number.

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}