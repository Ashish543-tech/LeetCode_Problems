class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] dp = new int[n];
        dp[0]  = nums[0];
        dq.addLast(0);
        int ans = Math.max(Integer.MIN_VALUE, dp[0]);
        for(int i=1; i<n; i++){
            dp[i] = Math.max(dp[dq.getFirst()], 0) + nums[i];
            ans = Math.max(ans, dp[i]);
            while(!dq.isEmpty() && dp[dq.getLast()] < dp[i])
                dq.removeLast();
            dq.addLast(i);
            if(i-k == dq.getFirst())
                dq.removeFirst();
        }

        return ans;
    }
}