class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        String s = Integer.toString(x);
        char[] chars = s.toCharArray();
        int first=0;
        int last=chars.length-1;
        while(first <= last){
            if(chars[first++] != chars[last--])
                return false;
        }
        
        return true;
    }
}