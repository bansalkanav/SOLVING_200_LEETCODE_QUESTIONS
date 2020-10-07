class Solution {
    public int singleNumber(int[] nums) {
       int[] bitCounts = new int[32];
       for (int i = 0; i < nums.length; i++) {
            int j=0;
            int num = nums[i];
            while(j<bitCounts.length){
                bitCounts[j]+=num&1;
                num=num>>1;
                j++;
            }
       }
       int ans=0;
       for (int i = bitCounts.length-1; i>=0; i--) {
           ans+=bitCounts[i]%3;
           if(i>0)ans=ans<<1;
       }
       
       return ans;
    }
}
