class Solution(object):
    def convertTemperature(self, celsius):
        """
        :type celsius: float
        :rtype: List[float]
        """
        a = [0,0]
        a[0] = celsius + 273.15
        a[1] = celsius * 1.80 + 32.00

        return a
        