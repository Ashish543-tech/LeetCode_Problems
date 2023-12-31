class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
                if(j > nums2.length){
                    break;
                }
            }
            else if(nums1[i] < nums2[j]){
                i++;
                if(i > nums1.length){
                    break;
                }
            }
            else{
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans = new int[al.size()];
        for(int k=0; k<al.size(); k++){
            ans[k] = al.get(k);
        }
        return ans;
    }
}