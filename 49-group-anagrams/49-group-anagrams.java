class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
             List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();

        if(strs.length <1)
            return list;

        //1.정렬 후 map에 담기
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key= String.valueOf(chars);

            List<String> values = map.getOrDefault(key, new ArrayList<>());
            values.add(strs[i]);
            map.put(key,values);
        }

        //2.
        for (String key : map.keySet()) {
            List<String> values = map.get(key);
            list.add(values);
//            List<String> value = map.get(key);
//            List<String> t=new ArrayList<>(value.size());
//            Collections.copy(t,value);
//            list.add(t);
        }

        return list;
    }
}