class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length-1];
        for(int i=0; i<nums.length; i++){
            if(arr[nums[i]-1] != 0){
                return nums[i];
            }
            else{
                arr[nums[i]-1] = nums[i];
            }
        }
        return nums[0];
    }
}