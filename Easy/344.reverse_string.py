from typing import List


# class Solution:
def reverseString(s: List[str]) -> None:
    #1
    end=s.__len__()-1
    start=0

    while start < end:
        s[start], s[end]= s[end], s[start]
        start+=1
        end-=1

    
    #2
    # s.reverse()

    #3.
    # s[:]=s[::-1]

        
        



input=["h","e","l","l","o"]

# print(input.__len__())
reverseString(input)
print(input)
