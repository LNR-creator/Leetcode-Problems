class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int c =0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] != nums[c]){
                c++;

            }
            nums[c] = nums[i];
        }

        return c+1;
    }
}