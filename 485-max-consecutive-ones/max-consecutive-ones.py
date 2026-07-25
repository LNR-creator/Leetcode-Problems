class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        maxc = 0
        for i in range(0,len(nums)):
            if nums[i] == 1:
                c=c+1
                maxc = max(c,maxc)
            else:
                c=0
        return maxc
        