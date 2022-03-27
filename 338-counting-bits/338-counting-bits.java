class Solution {
     public int[] countBits(int n) {
        int []answer=new int[n+1];

        for (int i = 0; i <= n; i++) 
            answer[i]=answer[i >> 1] + (i&1);
        
        return answer;
    }

}