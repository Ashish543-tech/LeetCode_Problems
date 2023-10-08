class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int m) {
        int i=0; 
        int n = flowerbed.length;
        if(n == 1)
            return m > 1 ? false : ((flowerbed[0] == 0 || m == 0) ? true : false);
        while(i<n){
            if(i == n-1 && flowerbed[i-1] != 1 && flowerbed[i] != 1){
                m--;
                i++;
            }
            else if(i == 0 && i+1 < n && flowerbed[i+1] != 1 && flowerbed[i] != 1){
                m--;
                i += 2;
            }
            else if(i-1 >= 0 && i+1 < n && flowerbed[i+1] != 1 && flowerbed[i-1] != 1 && flowerbed[i] != 1){
                m--;
                i += 2;
            }
            else{
                i++;
            }
                
        }
        return m<=0;
    }
}