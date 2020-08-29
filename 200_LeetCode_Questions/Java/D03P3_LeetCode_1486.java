// Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
// Memory Usage: 36.4 MB, less than 55.35% of Java online submissions for XOR Operation in an Array.

class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor ^= (start + (2 * i));
        }
        return xor;
    }
}
