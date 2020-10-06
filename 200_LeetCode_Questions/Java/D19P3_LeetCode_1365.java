class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[]=new int[101];
        
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=1;i<101;i++)
        {
            count[i]+=count[i-1];
        }
        
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<1)
            {
                res[i]=0;
                continue;
            }
            res[i]=count[nums[i]-1];                
        }
        return res;
    }
}