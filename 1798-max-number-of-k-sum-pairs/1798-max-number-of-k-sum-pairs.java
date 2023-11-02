class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = nums.length-1;
        Arrays.sort(nums);
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k)
            {
                count ++;
                i++;
                j--;
            }
            else if( sum < k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return count;
    }
}