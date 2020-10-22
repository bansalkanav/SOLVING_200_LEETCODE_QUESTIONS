# Count Negative Numbers in a Sorted Matrix
class Solution(object):
    def countNegatives(self, grid):
        count=0
        for a in range(len(grid)):
            for b in range(len(grid[a])):
                if grid[a][b] < 0:
                    count+=1
        return count