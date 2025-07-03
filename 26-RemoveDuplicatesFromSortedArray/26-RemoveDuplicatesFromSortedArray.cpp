// Last updated: 04/07/2025, 02:19:16
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        sort(nums.begin(),nums.end());

        auto it = unique(nums.begin(),nums.end());
        nums.erase(it,nums.end());
        return nums.size();
    }
};