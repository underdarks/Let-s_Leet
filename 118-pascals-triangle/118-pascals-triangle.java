class Solution {
    public List<List<Integer>> generate(int numRows) {
   List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = null,prev=null;
        
        for (int i = 0; i < numRows; ++i) {
            cur = new ArrayList<>();

            for (int j = 0; j <= i; ++j) {
                if (j == 0 || i == j)
                    cur.add(1);

                else
                    cur.add(prev.get(j) + prev.get(j - 1));
            }

            list.add(cur);
            prev=cur;
        }

        return list;
    }
}