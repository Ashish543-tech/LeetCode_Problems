class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }

        for(char x : t.toCharArray()){
            arr[x - 'a']--;
        }

        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}