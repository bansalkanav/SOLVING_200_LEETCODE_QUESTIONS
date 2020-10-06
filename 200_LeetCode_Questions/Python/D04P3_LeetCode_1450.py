class Solution:
    def busyStudent(self, startTime: List[int], endTime: List[int], queryTime: int) -> int:
        count=0
        j=0
        while j<len(startTime):
            for i in range(startTime[j],endTime[j]+1):
                if i==queryTime:
                    count+=1
            j+=1
        return count
