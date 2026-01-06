// Last updated: 1/6/2026, 9:42:17 PM
class Solution {
    public int removeElement(int[] nums, int val) {
         int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }
}