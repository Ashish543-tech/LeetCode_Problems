class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}