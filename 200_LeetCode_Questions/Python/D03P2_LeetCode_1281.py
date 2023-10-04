# Python3 code coming soon

n = int(input())
sum1 = 0 
prod = 1
while n > 0 :                    #n != 0 also works
    digit = n % 10               #Giving reminder i.e. 4 i.e. excluding first two numbers
    sum1 += int(digit)           #sum1 = sum1 + int(digit)
    prod *= int(digit)           #prod = prod * int(digit)
    
    n = n // 10                  ##Giving Quotient i.e. 23 i.e. excluding last number
print(prod - sum1)
    
