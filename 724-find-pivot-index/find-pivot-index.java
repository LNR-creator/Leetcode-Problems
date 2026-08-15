class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;
        int ls = 0;
        int rs = 0;
    for(int num : nums)
    {
        ts += num;
    }

        for(int i=0;i<nums.length;i++)
        {
            int j = i-1;
            int k = i+1;
         rs = ts - ls -nums[i];
            if(ls == rs)
            {
                return i;
            }

            ls += nums[i];
        } 
        return -1;
    }
}