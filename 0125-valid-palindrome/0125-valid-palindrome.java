class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "");
       s = s.replaceAll("\\s", "");
       s = s.toLowerCase();
       String str = "";
       for(int i=s.length()-1; i>=0; i--){
           str = str + s.charAt(i);
       }
       return s.equals(str); 
    }
}