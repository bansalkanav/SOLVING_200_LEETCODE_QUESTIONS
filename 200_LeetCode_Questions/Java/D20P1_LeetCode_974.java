class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int rem[]=new int[K];
        int sum=0,count=0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
            rem[((sum%K)+K)%K]++;
        }
        for(int i=1;i<rem.length;i++)
        {
            if(rem[i]>1)
            {
                count+=(rem[i]*(rem[i]-1)/2);
            }
        count+=rem[0];

        }
        return count;
    }
}