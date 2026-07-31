class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        Minprice = prices[0]
        profit = 0
        maxp = 0
        n = len(prices)
        for i in range(0,n):
            Minprice = min(Minprice,prices[i])
            profit = prices[i] - Minprice
            maxp = max(profit,maxp)
        return maxp