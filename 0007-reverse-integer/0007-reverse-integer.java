class Solution {
    public int reverse(int x) {
        int k = 1;
        if(x < 0){
            k = -1;
            x *= k;
        }
       long res = 0;
       while(x > 0){
           int lastDigit = x % 10;
           res = res * 10 + lastDigit;
           if(res > Integer.MAX_VALUE)
            return 0;
           x /= 10;
       }
       return (int)(res)*k;
    }
}