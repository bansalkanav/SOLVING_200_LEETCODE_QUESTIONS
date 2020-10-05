class Solution {
    static int mem[]=new int[40];
    public static int tribo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==2 || n==1)
        {
            return 1;
        }
        if(mem[n]!=0)
        {
            return mem[n];
        }
        mem[n]= tribo(n-1)+tribo(n-2)+tribo(n-3);
        return mem[n];
    }
    public int tribonacci(int n) {
    
        return tribo(n);
        
    }
}