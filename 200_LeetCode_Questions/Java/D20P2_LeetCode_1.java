class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer>hm=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            if(hm.containsKey(rem))
            {
                return new int[]{hm.get(rem),i};
            }
            hm.put(nums[i],i);
        }
        return new int[2];
    }
}