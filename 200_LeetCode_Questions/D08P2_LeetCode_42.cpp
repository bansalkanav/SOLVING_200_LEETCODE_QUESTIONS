class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        vector<int> MAX_LEFT(n);
        vector<int> MAX_RIGHT(n);
        
        int max_rt = -1, max_lt = -1;
        
        //Populating MAX_RIGHT and MAX_LEFT
        for(int i = n-1; i>=0; i--){
            MAX_RIGHT[i] = max_rt;
            max_rt = max(max_rt, height[i]);
        }
    
        for(int i = 0; i<=n-1; i++){
            MAX_LEFT[i] = max_lt;
            max_lt = max(max_lt, height[i]);
        }
        
        int result = 0;
        for(int i = 0; i<=n-1; i++){
            if(height[i] < MAX_LEFT[i] && height[i] < MAX_RIGHT[i]) 
                result += min(MAX_LEFT[i], MAX_RIGHT[i]) - height[i];
        }

        return result;

    }
};
