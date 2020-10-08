class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        int minval = INT_MAX;
        vector<vector<int>> ans;
        for(int i=1;i<arr.size();i++)
        {
            minval = min(arr[i]-arr[i-1],minval);
        }
        
        for(int i=1;i<arr.size();i++)
        {
            if(arr[i]-arr[i-1]==minval)
            {
                vector<int> temp;
                temp.push_back(arr[i-1]);
                temp.push_back(arr[i]);
                ans.push_back(temp);
            }
        }
        return ans;
    }
};
