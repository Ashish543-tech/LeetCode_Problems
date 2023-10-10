class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxCount = 0;
       for(int i=0; i<sentences.length; i++){
           int count = 0;
           String s = sentences[i];
           for(int j=0; j<s.length(); j++){
               if(s.charAt(j) == ' '){
                   count++;
               }
           }
            if(count > maxCount){
                maxCount = count;
                count = 0;
            }
       }
       return maxCount+1; 
    }
}