class Solution {
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            List<Integer> values = new ArrayList<>();

            for (int j = 0; j <= i; ++j) {
                if (j == 0 || i == j)
                    values.add(1);

                else {
                    List<Integer> rows = list.get(i - 1);
                    values.add(rows.get(j) + rows.get(j - 1));
                }
            }

            list.add(values);

        }
        
        return list;
        
    }
}