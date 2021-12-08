# class Solution:
import collections
from typing import Collection, List
import re


def mostCommonWord(paragraph: str, banned: List[str]) -> str:
    di={}
    words=[word for word in re.sub(r'[^\w]',' ',paragraph).lower().split() if not word in banned]
    counts=collections.Counter(words)

    return counts.most_common(1)[0][0]
    

paragraph = "a, a, a, a, b,b,b,c, c"
banned = ["a"]

print(mostCommonWord(paragraph,banned))
        