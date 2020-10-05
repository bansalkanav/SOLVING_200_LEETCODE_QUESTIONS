class Solution {
    
    private Map<String,String>hm=new HashMap<>(){{
        put("2","abc");
        put("3","def");
        put("4","ghi");
        put("5","jkl");
        put("6","mno");
        put("7","pqrs");
        put("8","tuv");
        put("9","wxyz");
    }};
    
    private List<String>res=new ArrayList<>();
    
    private void solve(String op,String digits)
    {
        if(digits.length()==0)
        {
            res.add(op);
            return;
        }
        String digit=digits.substring(0,1);
        String letters=hm.get(digit);
        for(int i=0;i<letters.length();i++)
        {
            String letter=hm.get(digit).substring(i,i+1);
            solve(op+letter,digits.substring(1));
        }
    }
    
    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0)
            solve("",digits);
        return res;
    }
}