class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        end=s.__len__()-1
        start=0

        while start < end:
            s[start], s[end]= s[end], s[start]
            start+=1
            end-=1