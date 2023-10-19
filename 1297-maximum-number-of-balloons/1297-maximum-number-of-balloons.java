class Solution {
    public int maxNumberOfBalloons(String text) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0; i<text.length(); i++){
           char c = text.charAt(i);
           if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n'){
               if(map.containsKey(c)){
                   map.put(c, map.get(c)+1);
               }
               else{
                   map.put(c, 1);
               }
           }
       }
       int minCount = Integer.MAX_VALUE;
       String target = "balloon";
        
        for (char c : target.toCharArray()) {
            if (!map.containsKey(c)) {
                return 0;
            } else {
                int count = map.get(c);
                if (c == 'l' || c == 'o') {
                    count /= 2;
                }
                minCount = Math.min(minCount, count);
            }
        }

        return minCount; 
    }
}