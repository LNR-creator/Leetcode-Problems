class Solution {
    public boolean canAliceWin(int[] nums) {
        int dd = 0;
        int sd = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                dd += nums[i];
            }
            else{
                sd += nums[i];
            }
        }

        if(sd>dd || dd>sd){
            return true;
        }
        return false;
    }
}