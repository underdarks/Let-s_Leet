class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length())
            return false;
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        
        //오름차순 정렬
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}