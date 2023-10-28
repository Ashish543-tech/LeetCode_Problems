class Solution {
    public void rotate(int[] nums, int k) {
      k = k % nums.length;  
      int[] arr = new int[nums.length];
      int index = nums.length-1;
      for(int i=k-1; i>=0; i--){
          arr[i] = nums[index--];
      }
      int j=0;
      for(int i=k; i<nums.length; i++){
          arr[i] = nums[j++];
      }

      int a = 0;
      for(int n : arr){
          nums[a++] = n;
      }
    }
}