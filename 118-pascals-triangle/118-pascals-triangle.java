class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            List<Integer> values = new ArrayList<>();

            for (int j = 0; j <= i; ++j) {
                if (j == 0 || i == j)
                    values.add(1);

                else
                    values.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
            }

            list.add(values);

        }

        return list;
        
    }
}