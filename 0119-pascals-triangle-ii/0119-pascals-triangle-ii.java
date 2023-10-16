public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int j = 1; j <= rowIndex; j++) {
            long next_val = prev * (rowIndex - j + 1) / j;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}