#Given an array nums containing n distinct numbers in the range [0, n], 
#return the only number in the range that is missing from the array.

x = list(map(int,input().strip().split(',')))
a = np.array(x)
print("Input:" , np.unique(a))
z = []
for i in range(0,len(a)+1):
    if i not in x :
        z.append(i)
print("Missing number :", z)
