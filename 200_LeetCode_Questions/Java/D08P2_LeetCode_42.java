// Runtime: 1 ms, faster than 95.03% of Java online submissions for Trapping Rain Water.
// Memory Usage: 39.1 MB, less than 81.66% of Java online submissions for Trapping Rain Water.

class Solution {
    public int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }
        int leftmaxsort[] = new int[height.length];
        int rightmaxsort[] = new int[height.length];
        int max = 0, sum = 0;
        leftmaxsort[0] = height[0];
        rightmaxsort[height.length - 1] = height[height.length - 1];
        for(int i = 1; i < height.length; i++){
            max = leftmaxsort[i - 1];
            max = (height[i] > max) ? height[i] : max;
            leftmaxsort[i] = max;
        }
        for(int i = height.length - 2; i >= 0; i--){
            max = rightmaxsort[i + 1];
            max = (height[i] > max) ? height[i] : max;
            rightmaxsort[i] = max;
        }
        for(int i = 1; i < height.length - 1; i++){
            sum += Math.min(leftmaxsort[i], rightmaxsort[i]) - height[i];
        }
        return sum;
    }
}
