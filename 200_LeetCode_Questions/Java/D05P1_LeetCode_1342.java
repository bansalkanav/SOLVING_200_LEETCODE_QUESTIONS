// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
// Memory Usage: 36.3 MB, less than 67.69% of Java online submissions for Number of Steps to Reduce a Number to Zero.

class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        while(num != 0){
            steps += ((num & 1) == 1) ? 2 : 1;
            num = num >> 1;
        }
        return (steps > 0) ? steps - 1 : steps;
    }
}
