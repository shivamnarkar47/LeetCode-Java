// Last updated: 04/07/2025, 02:19:27
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> allNums = nums1;
        allNums.insert(allNums.end(), nums2.begin(), nums2.end());
        sort(allNums.begin(), allNums.end());

        int n = allNums.size();
        if (n % 2 == 0) {
            return (allNums[n / 2 - 1] + allNums[n / 2]) / 2.0;
        } else {
            return (allNums[n / 2]);
        }
    }
};