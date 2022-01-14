class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        if(c1.length != c2.length)
            return false;
        
        //오름차순 정렬
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) 
            if(c1[i] != c2[i]) return false;

        return true;
    }
}