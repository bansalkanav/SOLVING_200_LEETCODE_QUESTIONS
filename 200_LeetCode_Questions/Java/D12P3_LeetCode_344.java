/*
Runtime: 1 ms, faster than 95.19% of Java online submissions for Reverse String.
Memory Usage: 45.5 MB, less than 94.24% of Java online submissions for Reverse String.
*/

class Solution {
    public void reverseString(char[] s) {
        char hold;
        for(int i = 0 ; i < s.length/2 ; i++){
            hold = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = hold;
        }
    }
}