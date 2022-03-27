class Solution {
      public int[] countBits(int n) {
        int []answer=new int[n+1];
        int offset=1;

        for (int i = 1; i <= n; i++) {
            if(offset*2 == i)
                offset*=2;

            answer[i]=answer[i-offset]+1;
        }
        
        return answer;
    }

}