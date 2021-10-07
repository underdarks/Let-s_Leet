class Solution:
    def isValid(self, string: str) -> bool:
        while '{}' in string or '()' in string or '[]' in string:
              string=string.replace('{}','')
              string=string.replace('[]','')
              string=string.replace('()','')

        return string==''