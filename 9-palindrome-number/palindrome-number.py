class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        ori = x
        rnum = 0

        while x>0:
            dig = x%10
            rnum = 10*rnum + dig
            x = x/10
        if ori == rnum:
            return True
        return False


        