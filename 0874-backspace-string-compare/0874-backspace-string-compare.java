class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int c1 = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '#'){
                c1++;
            }
            else{
                if(c1>0){
                    c1--;
                }
                else{
                    sb1.append(s.charAt(i));
                }
            }
        }
        int c2 = 0;
        for(int j=t.length()-1; j>=0; j--){
            if(t.charAt(j) == '#'){
                c2++;
            }
            else{
                if(c2 > 0){
                    c2--;
                }
                else{
                    sb2.append(t.charAt(j));
                }
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}
