// Runtime: 1 ms, faster than 99.80% of Java online submissions for Counting Bits.
// Memory Usage: 43.5 MB, less than 73.28% of Java online submissions for Counting Bits.

class Solution {
    public int[] countBits(int num) {
        if(num == 0){
            return new int[]{0};
        }
        int ones[] = new int[num + 1];
        for(int i = 1; i < ones.length; i++){
            ones[i] = ones[i & (i - 1)] + 1;
        }
        return ones;
    }
}
