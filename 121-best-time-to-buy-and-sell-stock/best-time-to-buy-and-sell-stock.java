class Solution {
    public int maxProfit(int[] prices) {
      int minprice = Integer.MAX_VALUE;
      int maxprice = 0;

        for(int price:prices)
        {
            minprice = Math.min(price,minprice);

            int profit = price - minprice;

            maxprice = Math.max(profit,maxprice);
        }

        return maxprice;
    }
}