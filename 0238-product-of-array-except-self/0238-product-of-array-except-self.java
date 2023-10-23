class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] left_pro = new int[nums.length];
       int[] right_pro = new int[nums.length];
       int[] ans = new int[nums.length];
       
       left_pro[0] = 1;
       right_pro[nums.length-1] = 1;
       for(int i=1; i<nums.length; i++){
           left_pro[i] = nums[i-1] * left_pro[i-1];
       }
       for(int i=nums.length-2; i>=0; i--){
           right_pro[i] = nums[i+1] * right_pro[i+1];
       }
       for(int j=0; j<nums.length; j++){
           ans[j] = left_pro[j] * right_pro[j]; 
       }
       return ans;
    }
}