class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k))
            {
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}