class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        int n = pattern.length();
        
        for(int i=0; i<n; i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(arr[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}