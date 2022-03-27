class Solution {
     public int[] countBits(int n) {
        int []answer=new int[n+1];

        for (int i = 0; i <= n; i++) {
            int count=0;
            String s = Integer.toBinaryString(i);

            for (char c : s.toCharArray()) {
                if (c == '1')
                    count++;
            }

            answer[i]=count;
        }

        return answer;
    }

}