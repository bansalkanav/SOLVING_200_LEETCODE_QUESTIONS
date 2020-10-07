class Solution {
    public int[] sortByBits(int[] arr) {
        //sorting the array to catch up the case two different values have same no. of bits
        Arrays.sort(arr);
        
        int maxBits=14;//max value of an array element can be 10^4 which in binary can be represented using 14 bits, further out of which only 5 bits are set
        
        //counting how many elements with a particular bitcounts we have
        //Integer.bitCount(val) function returns no. of set bits in the binary representation of the value
        
        int bitsCount[]=new int[maxBits+1];
        
        for(int i=0;i<arr.length;i++)
        {
            bitsCount[Integer.bitCount(arr[i])]++;
        System.out.println(Integer.bitCount(arr[i]));
            
        }
        
        //obtaining starting positions of values associated with all possible bitcounts (i.e. bitcount 0,1,2,3,...13)
        int startIndex[]=new int[maxBits+1];
        startIndex[0]=0;//value with 0 bitcount will be placed first
        
        for(int i=1;i<startIndex.length;i++)
        {
            startIndex[i]=startIndex[i-1]+bitsCount[i-1];
        }
        
        //now as we have already sorted the array, we can proceed to find out the position of array elements in the order of increasing set bitcount
        int result[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            result[startIndex[Integer.bitCount(arr[i])]++]=arr[i];
        }
        return result;
    }
}
