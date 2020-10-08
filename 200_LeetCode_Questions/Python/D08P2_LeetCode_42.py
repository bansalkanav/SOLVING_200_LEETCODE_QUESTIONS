#Given n non-negative integers representing an elevation map where the width of each bar is 1, 
#compute how much water it is able to trap after raining.

class Solution:
  def trap(self, height: List[int]) -> int:
      
      water = 0
      index = 0
      stack = []
      
      while index < len(height):
          while len(stack) != 0 and height[index] > height[stack[len(stack) - 1]]:
              top = stack.pop()
              
              if len(stack) == 0:
                  break
              
              width = index - stack[len(stack) - 1] - 1
              min_height = min(height[index], height[stack[len(stack) - 1]])
              min_height -= height[top]
              
              area = width * min_height
              water += area
          
          stack.append(index)
          index += 1
      
      return water