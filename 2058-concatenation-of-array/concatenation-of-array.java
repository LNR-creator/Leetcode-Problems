class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = 2*nums.length;
        int[] ans = new int[n];
        int i=0;
       for( i=0;i<nums.length;i++)
       {
        ans[i] = nums[i];
       } 
       int k = 0;
       for(int j=i;j<n;j++)
       {
        ans[j] = nums[k++];
       }

       return ans;
    }
}