class Solution {
    static List<List<Integer>>rs=new ArrayList();
    
    public void swap(int []nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void permutations(int nums[],int start)
    {
        if(start==nums.length)
        {
            List<Integer>ls=new ArrayList();
            
            for(int i=0;i<nums.length;i++)
            {
                ls.add(nums[i]);
            }
            
            rs.add(ls);
            return;
        }
           
        for(int i=start;i<nums.length;i++)
        {
            swap(nums,i,start);
            permutations(nums,start+1);
            swap(nums,i,start);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        
        permutations(nums,0);
        
        return rs;
    }
}