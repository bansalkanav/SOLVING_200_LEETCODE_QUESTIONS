class Solution {
    public static int solve(int [][]grid,int row,int col)
    {
        if(row<0 || col<0 || row==grid.length || col==grid[0].length || grid[row][col]==0)
            return 0;
        
        int temp=grid[row][col];
        grid[row][col]=0;
        
        int up=solve(grid,row-1,col);
        int down=solve(grid,row+1,col);
        int left=solve(grid,row,col-1);
        int right=solve(grid,row,col+1);
            
        grid[row][col]=temp;
        
        return temp + Math.max(up,Math.max(down,Math.max(left,right)));
    }
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                int value=solve(grid,i,j);
                max=max>value?max:value;
            }
        }
        return max;
    }
}