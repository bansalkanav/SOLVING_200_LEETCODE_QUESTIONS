// A simple brute force solution to the problem while taking advantage of sorted grid
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int tcount=0;
        int pcount;
        for(int i=grid.size()-1;i>=0;--i){
            pcount=0;
            for(int j=grid[i].size()-1;j>=0;j--){
                if(grid[i][j]>=0){
                    pcount=(grid[i].size()-1)-j;
                    break;
                }
                pcount++;
            }
            tcount+=pcount;
            if(pcount==0){
                break;
            }
        }
        return tcount;
    }
};
//Time Complexity : O(m*n)

//Solution 2
//Binary search approach to find the first negative number in every row
class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
       int count=0;
       for(int i=0;i<grid.size();i++){
           int l,r,m;
           l=0;
           r=grid[i].size()-1;
           while(l<=r){
             m=(l+r)/2;
            if(grid[i][m]>=0){
                l=m+1;
            }else if(m>l){
                r=m;
            }else{
                count+=grid[i].size()-m;
                break;
            }
           }
       }
        return count;
    }
};
//Time Complexity : O(m*log(n))
