from collections import Counter
class Solution:
    def firstUniqChar(self, s: str) -> int:
        a = list(s)
        freq = Counter(a)
        c = 0
        for x in a:
            if freq[x] == 1:
                return c
                break
            c += 1
        return -1 