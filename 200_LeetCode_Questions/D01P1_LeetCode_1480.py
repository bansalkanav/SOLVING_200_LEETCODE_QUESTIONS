from typing import List
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0
        run_sum = []
        for i in range(len(nums)):
            sum += nums[i]
            run_sum.append(sum)
        return run_sum
