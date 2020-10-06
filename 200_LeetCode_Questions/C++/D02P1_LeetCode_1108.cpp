class Solution {
public:
    string defangIPaddr(string address) {
        string new_string="";
        for(int i=0;i<address.size();i++){
            if(address[i]=='.'){
                new_string.append("[.]");
            }
            else{
                new_string=new_string+address[i];
            }
        }
        return new_string;
        
    }
};