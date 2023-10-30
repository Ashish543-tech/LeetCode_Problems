class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int openCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(openCount > 0){
                    ans.append('(');
                }
                openCount++;
            }
            if(s.charAt(i) == ')'){
                openCount--;
                if(openCount > 0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
}
