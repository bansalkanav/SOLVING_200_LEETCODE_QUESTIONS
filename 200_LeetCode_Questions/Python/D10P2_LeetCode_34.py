# Find First and Last Position of Element in Sorted Array
class Solution(object):
    def searchRange(self, nums, target):
        if len(nums) == 0: 
            return([-1, -1])
        low_element, high_element = 0, len(nums)
        while low_element < high_element:
            mid_element = (high_element + low_element) // 2
            if nums[mid_element] == target: 
                left_element, right_element = mid_element, mid_element
                while (left_element-1) >= 0 and nums[left_element-1] == target: 
                    left_element -= 1
                while (right_element+1) < len(nums) and nums[right_element+1] == target: 
                    right_element += 1
                return([left_element, right_element])
                break
            elif nums[mid_element] < target: 
                low_element = mid_element + 1
            elif nums[mid_element] > target: 
                high_element = mid_element
        return([-1, -1])