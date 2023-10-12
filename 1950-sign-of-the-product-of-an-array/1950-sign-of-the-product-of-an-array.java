class Solution {
    public int arraySign(int[] nums) {
        int p = 1;
        for(int n : nums){
            if(n > 0){
                p *= 1;
            }
            else if(n < 0){
                p *= -1;
            }
            else{
                p = 0;
            }
        }
        if(p > 0){
            return 1;
        }
        else if(p < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
}