class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        unordered_map<int,int> freq;
        vector<int> ans;
        for(auto it : nums){
            freq[it]++;
        }
        int n = nums.size();
        for(int i = 1; i <= n; i++){
            if(freq[i] == 0){
                ans.push_back(i);
            }
        }
        return ans;
    }
};