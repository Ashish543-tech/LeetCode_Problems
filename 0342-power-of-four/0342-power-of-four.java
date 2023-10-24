class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 4 && n != 1){
            return false;
        }
        double x = Math.log(n) / Math.log(4);
        return x == Math.ceil(x) && x == Math.floor(x);
    }
}
