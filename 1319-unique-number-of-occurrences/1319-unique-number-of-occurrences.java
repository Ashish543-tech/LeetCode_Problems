class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }

        return map.size()==set.size();
    }
}