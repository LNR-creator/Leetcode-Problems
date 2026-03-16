class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        sd =0
        dd = 0
        for i in range(0,len(nums)):
            if nums[i] > 9:
                dd += nums[i]
            else:
                sd += nums[i]
        if (sd > dd) or (dd > sd):
            return True
        return False