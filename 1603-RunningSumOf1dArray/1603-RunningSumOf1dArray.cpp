// Last updated: 04/07/2025, 02:18:07
class Solution {
public:
    vector<int> runningSum(vector<int> &nums) {
        vector<int> result = {nums[0]};

        for (int i = 1; i < nums.size(); i++) {
            result.push_back(result.back() + nums[i]);
        }
        return result;
    }
};