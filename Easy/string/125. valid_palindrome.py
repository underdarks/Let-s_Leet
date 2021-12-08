import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        s=re.sub('[^a-z0-9]','',s)
        return s==s[::-1]

        

            


s=Solution()
# str="a."
str="I, man, am regal; a German am I."
# print(s.isPalindrome(str))


print(str[::-1])

