class NumMatrix {
private:
    vector<vector<int>> full;
    
public:
    NumMatrix(vector<vector<int>>& matrix) {
        if(matrix.size()==0) return;
        vector<int> t;
    
        int row = matrix.size(),col = matrix[0].size();
        
        
        for(int i=0;i<col+1;i++)
        {
            t.push_back(0);
        }
        full.push_back(t);
        
        for(int i=0;i<row;i++)
        {
            full.push_back(t);
        }
        cout<<"row="<<row;
        cout<<"col="<<col;
        cout<<full.size();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                full[i][j]=full[i-1][j]+full[i][j-1]+matrix[i-1][j-1]-full[i-1][j-1]; 
            }
        }
        
    }
    
    int sumRegion(int row1, int col1, int row2, int col2) {
        return full[row2+1][col2+1]-full[row1][col2+1]-full[row2+1][col1]+full[row1][col1];
        // return 0;
    }
};

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix* obj = new NumMatrix(matrix);
 * int param_1 = obj->sumRegion(row1,col1,row2,col2);
 */
