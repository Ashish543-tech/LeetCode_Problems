class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        
        for(int n : nums1){
            set1.add(n);
        }

        for(int n : nums2){
            set2.add(n);
        }

        for(int n : nums2){
            if(!set1.contains(n)){
                set3.add(n);
            }
        }
        set1.removeAll(set2);
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set3));

        return ans;
    }
}