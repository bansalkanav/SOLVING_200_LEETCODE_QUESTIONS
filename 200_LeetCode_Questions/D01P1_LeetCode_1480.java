//Runtime : 0ms faster than 100% of Java Submissions
//Memory usage : 39 MB less than 99.58% of Java Submissions 

class Solution {
    public int[] runningSum(int[] nums) {
        int[] running_sum = new int[nums.length];
        running_sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            running_sum[i] = running_sum[i - 1] + nums[i];
        }
        return running_sum;
    }
}
