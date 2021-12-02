import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        t=re.sub('[-=+,#/\?:^.@*\"※~ㆍ!』‘|\(\)\[\]`\'…》\”\“\’·]','',s)
        end=len(t)
        for i in range(len(t)):
            end-=1
            if end < i: break
            if s[i] != s[end]:
                return False

        
        return True

        

            


s=Solution()
# str="a."
str="A man, a plan, a canal: Panama"
print(s.isPalindrome(str))
