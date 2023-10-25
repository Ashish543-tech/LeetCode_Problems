class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String s = strs[0];
        String e = strs[strs.length-1];
        for(int i=0; i<Math.min(s.length(), e.length()); i++){
            if(s.charAt(i) != e.charAt(i)){
                return ans.toString();
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}