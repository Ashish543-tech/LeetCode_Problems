class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] ans = new int[n1];
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        int j=1;
        if(n1 == 1 && n2 == 1){
            ans[0] = -1;
        }
        while(i < n2 && j < n2){
            if(nums2[j] > nums2[i]){
                map.put(nums2[i], nums2[j]);
                i++;
                j = i+1;
            }
            else{
                j++;
                if(j == n2){
                    map.put(nums2[i], -1);
                    i++;
                    j = i+1;
                }
            }
            if(i == n2-1){
                map.put(nums2[n2-1], -1);
            }
        }
        for(int k=0; k<n1; k++){
            if(map.containsKey(nums1[k])){
                ans[k] = map.get(nums1[k]);
            }
        }
        return ans;
    }
}