// Last updated: 04/07/2025, 02:19:03
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int low = 1;
        for (int i = 0; i < nums.size(); ++i) {
             if ( nums.at(i) == low) {
                low++;
                continue;
            }
        }
        return low;
    }
};