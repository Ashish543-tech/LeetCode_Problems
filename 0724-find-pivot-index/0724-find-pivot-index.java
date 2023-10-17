class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        int leftSum = 0;
        for(int n : nums){
            tSum += n;
        }
        for(int i=0; i<nums.length; i++){
            if(i != 0){
                leftSum += nums[i-1];
            }
            if(tSum - leftSum - nums[i] == leftSum){
                return i;
            }
        }
        return -1;
    }
}