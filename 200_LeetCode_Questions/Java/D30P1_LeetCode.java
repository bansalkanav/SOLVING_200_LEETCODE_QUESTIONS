class Solution {
    public String convert(String s, int numRows) {
        StringBuffer sf = new StringBuffer();
        char[] chs = s.toCharArray();
        int n = s.length();      
        
        for (int i = 0; i < numRows; i++) {
            int incr = (numRows - 1) * 2;
            if (i == 0 || i == numRows - 1) {
                incr = Math.max((numRows - 1) * 2, 1);
                for (int j = i; j < n; j += incr) {
                    sf.append(chs[j]);
                }
                continue;
            } 
            int down = incr - 2 * i;
            int up = incr - down;
            for (int j = i, m = 1; j < n; j += (m % 2 != 0 ? down : up), m++) {
                sf.append(chs[j]);
            }
        }     
        
        return sf.toString();

    }
}