// Runtime: 0 ms, faster than 100.00% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// Memory Usage: 39.5 MB, less than 83.12% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101]; 
        for (int i = 0; i < nums.length; i++) {
                freq[nums[i]]++;
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) { 
                int f = freq[i];
                freq[i] = count;
                count = count + f;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = freq[nums[i]];
        }
        return nums;
    }
}
