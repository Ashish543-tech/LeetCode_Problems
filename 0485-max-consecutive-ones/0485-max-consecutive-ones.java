class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int curr = 0;
       int max = Integer.MIN_VALUE;
       for(int n : nums){
           if(n == 1){
               curr++;
           }
           else{
               curr = 0;
           }
           if(curr > max){
               max = curr;
           }
       }
       return max; 
    }
}