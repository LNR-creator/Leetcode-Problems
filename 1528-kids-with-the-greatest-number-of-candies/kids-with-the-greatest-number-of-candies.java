class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int a = candies[i] + extraCandies;
            int j=0;
            while(j< candies.length && a >= candies[j])
            {
                
                j++;
            }

            if(candies.length == j ){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }

        return arr;
    }
}