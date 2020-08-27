//Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
//Memory Usage: 39.8 MB, less than 59.61% of Java online submissions for Shuffle the Array.

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for(int i = 0, j = 0; j < n; i+=2, j++){
            shuffled[i] = nums[j];
            shuffled[i + 1] = nums[j + n];
        }
        return shuffled;
    }
}
