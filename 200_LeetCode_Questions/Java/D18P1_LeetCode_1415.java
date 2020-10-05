# Java code coming soon
class Solution {
    
    private List<String>res=new ArrayList<>();
    
    private void solve(int n,StringBuilder ip,char arr[])
    {
        if(ip.length()==n)
        {
            res.add(ip.toString());
            return;
        }
            
        for(int i=0;i<arr.length;i++)
        {
            if(ip.length()==0 || (ip.charAt(ip.length()-1)!=arr[i]))
            {
                ip.append(arr[i]);
                solve(n,ip,arr);
                ip.setLength(ip.length()-1);
            }
        }
    }
    
    public String getHappyString(int n, int k) {
        
        char arr[]=new char[]{'a','b','c'};
        StringBuilder ip=new StringBuilder();
        char prev='d';
        
        solve(n,ip,arr);
        // System.out.println(res);
        
        if(k>res.size())
        {
            return "";            
        }else{
            return res.get(k-1);            
        }
    }
}