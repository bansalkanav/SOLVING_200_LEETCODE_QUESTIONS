class Solution:
    def countBits(self, num: int) -> List[int]:
        result = list()
        for item in range(num+1):
            count = 0
            while item != 0:
                # count = count + (item & 1)
                # item = item >> 1
                # Here complexity will be run for number of set bits
                
                count = count + 1
                item = item & (item-1)
            result.append(count)
        return result
        
