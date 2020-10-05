class Solution {
    List<List<Integer>> lst=new ArrayList<>();
    
    public void sets(int start,List<Integer>sub,int nums[],int end)
    {
        if(sub.size()>end)
            return;
        if(sub.size()==end)
        {
            lst.add(new ArrayList<>(sub));
            return;
        }
        
        for(int i=start;i<nums.length;i++)
        {
            sub.add(nums[i]);
            sets(i+1,sub,nums,end);
            sub.remove(sub.size()-1);
        }
        return;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        for(int i=0;i<=nums.length;i++)
        {
            sets(0,new ArrayList<Integer>(),nums,i);
        }
        return lst;
    }
}