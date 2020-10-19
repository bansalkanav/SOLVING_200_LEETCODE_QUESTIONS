class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        def bsearch(nums, target, lo, hi):
            if lo == hi:
                return lo if nums[lo] == target else -1

            mid = (lo + hi) // 2
            if nums[mid] == target:
                return mid
            
            if (nums[hi] > nums[mid] and (target >= nums[mid] and target <= nums[hi])) or (nums[hi] < nums[mid] and (target <= nums[hi] or target >= nums[mid])):
                return bsearch(nums, target, mid + 1, hi)
            else:
                return bsearch(nums, target, lo, mid)
            
        return bsearch(nums, target, 0, len(nums) - 1)
