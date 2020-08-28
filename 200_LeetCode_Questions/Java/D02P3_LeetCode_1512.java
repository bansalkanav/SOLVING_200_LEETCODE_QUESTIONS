//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Good Pairs.
//Memory Usage: 36.8 MB, less than 79.98% of Java online submissions for Number of Good Pairs.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }
        int pairs = 0;
        for (int v : frequency.values()) {
            pairs += v * (v - 1)/2;
        }
        return pairs;
    }
}
