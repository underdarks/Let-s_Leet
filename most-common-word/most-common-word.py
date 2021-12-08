class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
            di={}
    

            for word in paragraph.lower().replace('!',' ').replace('?',' ').replace(',',' ').replace('.',' ').replace(':',' ').replace(';',' ').replace('\'',' ').split():
                if not word in banned:
                    if word in di:
                        di[word]+=1
                    else:
                        di[word]=1


            for key,value in di.items():
                if value == max(di.values()):
                    return key

        