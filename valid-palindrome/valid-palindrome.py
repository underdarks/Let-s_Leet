import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=re.sub('[-_=+,#/\?:^.@*\{"};※~ㆍ!』‘|\(\)\[\]`\'…》\”\“\’·]','',s).replace(' ','').lower()
        end=len(s)
        for i in range(len(s)):
            end-=1
            if end < i: break
            if s[i] != s[end]:
                return False

        
        return True
