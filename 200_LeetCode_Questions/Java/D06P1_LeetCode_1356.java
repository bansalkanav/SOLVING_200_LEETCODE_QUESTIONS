/**
 *  Link to problem : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits
 *  Runtime : 5ms faster than 80% of Java Submissions
    Memory usage : 39 MB less than 79% of Java Submissions
*/



class Solution {
    public int[] sortByBits(int[] arr) 
    {        
        ArrayList<Integer> nums = new ArrayList<Integer>(arr.length);
        for(int i : arr)
            nums.add(i);
        
        nums.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
            
            int compareBit = getBitCount(a).compareTo(getBitCount(b));
            
            if(compareBit==0)            
                return a.compareTo(b);
            
            return compareBit;
        }
        });
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = nums.get(i);
        }
        return arr;
    }
    
    public Integer getBitCount(Integer n)
    {
        int num = n.intValue();
        
        int count = 0;
        
        while(num>0)
        {
            num &= num-1; // clear the LSB and increase count
            count++;
        }
        
        return new Integer(count);
    }
}