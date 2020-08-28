class Solution {
public:
    vector<int> partitionLabels(string S) {
        vector<int> last(26);
        int i;
        for(i=0;i<S.length();i++)
            last[S[i]-'a']=i;
        vector<int> ans;
        int j=0, k=0;
        for(i=0;i<S.length();i++){
            j= max(j,last[S[i]-'a']);
            if(i==j){
                int len=j-k+1;
                ans.push_back(len);
                k=i+1;
            }
        }
        return ans;
    }
};
