class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int i,j;
        int n= A.size();
        for(i=0;i<n-1;i++){
            if(A[i+1]>0)
                break;
        }
        j=i+1;
        vector<int> ans(n);
        int k=0;
        while(i>=0 && j<n){
            if(abs(A[i])<A[j]){
                ans[k++]=pow(A[i--],2);
            }
            else
                ans[k++]=pow(A[j++],2);
        }
        while(i!=-1){
            ans[k++]=pow(A[i--],2);
        }
        while(j!=n)
            ans[k++]=pow(A[j++],2);
        return ans;
    }
};
