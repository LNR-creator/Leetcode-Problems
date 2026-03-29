class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        arr = [0]*len(nums)
        for i in range(len(nums)):
            arr[i] = nums[i]*nums[i]
        
        arr.sort()

        return arr
