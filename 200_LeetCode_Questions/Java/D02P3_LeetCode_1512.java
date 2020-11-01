// Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
// Memory Usage: 36.1 MB, less than 15.10% of Java online submissions for XOR Operation in an Array.

class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int ans=0;
        
        for(int i=0; i<n; i++){
            nums[i] = start + 2*i;
        }
        
        for(int i=0 ; i<n; i++){
            ans = ans^nums[i];
        }
        
        return ans;
    }
}
