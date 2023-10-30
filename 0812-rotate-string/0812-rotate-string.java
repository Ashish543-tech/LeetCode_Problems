class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() == 1 && goal.length() == 1){
            if(s.equals(goal)) return true;
            else return false;
        }
        String str = s + s;
        if(s.length() != goal.length()) return false;
        else return str.contains(goal);
    }
}