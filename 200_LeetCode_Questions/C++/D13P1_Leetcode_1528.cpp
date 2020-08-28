class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        int i;
        string ans=s;
        for(i=0;i<s.length();++i){
            ans[indices[i]]= s[i];
        }
        return ans;
    }
};
