class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not len(needle):
            return 0

        for str in haystack:
            pass
    

class Que:
    def __init__(self) -> None:
        self.que=[]
        self.head=0

    def enqueue(self,item):
        self.que.append(item)

    def dequeue(self):
        value=None

        if not self.is_empty():
            value=self.que[self.head]
            self.head+=1

        return value

    def is_empty(self):
        return self.head >= len(self.que)

    def all_search(self):
        return self.que[self.head:]

        

    

