class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        if(word2.length() > word1.length()){
            while(i < word1.length()){
                ans.append(word1.charAt(i));
                ans.append(word2.charAt(i));
                i++;
            }
            while(i < word2.length()){
                ans.append(word2.charAt(i));
                i++;
            }
        }
        else{
            while(j < word2.length()){
                ans.append(word1.charAt(j));
                ans.append(word2.charAt(j));
                j++;
            }
            while(j < word1.length()){
                ans.append(word1.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}