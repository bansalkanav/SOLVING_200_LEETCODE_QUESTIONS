class Solution {
    
    private void solve(int o,int c,String op,List<String>res)
    {
        if(o==0 && c==0)
        {
            res.add(op);
            return;
        }
        if(o!=0)
        {
            String op1=op+"(";
            solve(o-1,c,op1,res);
        }
        if(o<c)
        {
            String op2=op+")";
            solve(o,c-1,op2,res);
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        int open=n,close=n;
        String op="";
        solve(open,close,op,res);
        return res;
    }
}