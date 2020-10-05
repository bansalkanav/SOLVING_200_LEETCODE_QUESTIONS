class Solution {
    private int count = 0;
    
    private void rec(char arr[],boolean visited[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            
            count++;
            visited[i]=true;
            rec(arr,visited);
            visited[i]=false;
            
            while(i+1<arr.length && arr[i]==arr[i+1])
            {
                i++;
            }
        }
    }
    
    public int numTilePossibilities(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        char arr[]=s.toCharArray();
        
        boolean visited[]=new boolean[s.length()];
        
        Arrays.sort(arr);
        
        rec(arr,visited);
        
        return count;
    }
    
}