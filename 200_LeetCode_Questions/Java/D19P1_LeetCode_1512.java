class Solution {
    
    
    public int numIdenticalPairs(int[] nums) {
        
        int count[]=new int[101];
        
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        int pairs=0;
        for(int i=1;i<101;i++)
        {
            if(count[i]<2)
            {
                continue;
            }
            else
            {
                pairs+=count[i]*(count[i]-1)/2;                
            }
        }
        return pairs;
    }
}