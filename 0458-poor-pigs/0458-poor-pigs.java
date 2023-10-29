class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets == 1) {
            return 0; 
        }

        int states = minutesToTest / minutesToDie + 1;
        int low = 1, high = buckets;

        while (low <= high) {
            int mid = (low + high) / 2;
            double statesChecked = Math.pow(states, mid);

            if (statesChecked >= buckets) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}