// Last updated: 09/07/2025, 00:07:37
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target>nums[mid]){
                low= mid+1;
            }
            else if (target<nums[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
        }

         return low;
    }
}