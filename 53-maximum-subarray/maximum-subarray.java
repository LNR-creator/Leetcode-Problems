class Solution {
    public int maxSubArray(int[] nums) {
        int minlen = 0;
        int i =0,j=0;
        int currsum = nums[0];
        int maxsum = nums[0];

        for(i=1;i<nums.length;i++)
        {
            currsum = Math.max(nums[i],currsum + nums[i]);
            maxsum = Math.max(maxsum,currsum);
        }

        return maxsum;
    }
}