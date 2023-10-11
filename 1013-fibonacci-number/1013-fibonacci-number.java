class Solution {
    public int fib(int n) {
       int f1 = 0;
       int f2 = 1;
       if(n < 2){
           return n;
       }
       int cSum = 0;
       for(int i=2; i<=n; i++){
           cSum = f1 + f2;
           f1 = f2;
           f2 = cSum;
       }
       return cSum; 
    }
}