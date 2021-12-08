from typing import List


class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        list=[]

        for log in logs:
            
            if log.replace(' ',"").isalpha():   #문자로 구성되있는지 확인
                list.append(log)


        


        