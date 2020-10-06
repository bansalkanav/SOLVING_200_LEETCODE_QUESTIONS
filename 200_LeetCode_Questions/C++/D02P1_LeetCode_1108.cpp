// Problem :  Defanging an IP Address

// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

// Example 1:
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
  
// Solution : 

class Solution {
public:
    string defangIPaddr(string address) {
       string new_address;
        string p;
        int n = address.size();
    for(int i = 0;i<n;i++){
        p = address[i];
        if (p == "."){
            new_address.append("[.]");
        }
        else{
            new_address.append(p);
        }
    }
        return new_address;
    }
};
