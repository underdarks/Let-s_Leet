class Solution {
    public boolean isAnagram(String s, String t) {
         Map<Character,Integer> map=new HashMap<>();
        
        //1.해쉬생성(문자열의 각 문자를 해쉬화)
        for(char c: s.toCharArray()){
            Integer value = map.getOrDefault(c, 0);
            map.put(c,value+1);
        }

        for(char c: t.toCharArray()){
            Integer value = map.getOrDefault(c, 0);
            if(value.equals(0))
                return false;
            
            else
                map.put(c,value-1);
        }

        for (Character key : map.keySet()) {
            if(map.get(key) > 0)
                return false;
            
        }
        
        return true;
    }
}