class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        x = abs(x)

        r = 0
        while r*r <= x:
            r += 1

        return r-1
        