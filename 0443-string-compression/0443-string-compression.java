class Solution {
    public int compress(char[] chars) {
        String str = String.valueOf(chars[0]);
        int freq = 1;
        for(int i=1; i<chars.length; i++){
            if(chars[i-1] == chars[i]){
                freq++;
            }
            else{
                if(freq > 1){
                    str += String.valueOf(freq);
                    freq = 1;
                }
                str += String.valueOf(chars[i]);
            }
        }
        if(freq > 1){
            str += String.valueOf(freq);
        }
        char[] ans = str.toCharArray();
        for(int i=0; i<ans.length; i++){
            chars[i] = ans[i];
        }
        return ans.length;
    }
}