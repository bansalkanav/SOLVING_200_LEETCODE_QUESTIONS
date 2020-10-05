class Solution {
    int ans=0;
   
   private boolean isPerfectSquare(int prev, int current) {
       double sqrt = Math.sqrt(prev + current);
       return (sqrt - Math.floor(sqrt)) == 0;
   }
   
   private void solve(int nums[],ArrayList<Integer>sub,boolean visited[])
   {
       if(sub.size()==nums.length)
       {
           ans++;
           return;
       }
       for(int i=0;i<nums.length;i++)
       {
           if(visited[i])
           {
               continue;
           }
           if(i>0 && !visited[i-1] && nums[i]==nums[i-1])
           {
               continue;
           }
           if(!sub.isEmpty() && !isPerfectSquare(sub.get(sub.size()-1),nums[i]))
           {
               continue;
           }
           sub.add(nums[i]);
           visited[i]=true;
           solve(nums, sub, visited);
           visited[i]=false;
           sub.remove(sub.size()-1);
       }
   }

   
   public int numSquarefulPerms(int[] A) {
       if(A.length==1)
           return 1;
       Arrays.sort(A);
       boolean visited[]=new boolean[A.length];
       solve(A,new ArrayList<Integer>(),visited);
       
       return ans;
   }
}