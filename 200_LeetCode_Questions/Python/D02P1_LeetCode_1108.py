# Python3 ,By :- Harsh Udai
# Que. Defanging an IP Address

class Solution:
    def defangIPaddr(self, address: str) -> str:
        str1=""
        for i in range(0,len(address)):
            if(address[i]=='.'):
                str1=str1+'[.]'
            else:
                str1=str1+address[i]
                
        return str1