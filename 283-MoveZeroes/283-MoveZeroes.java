// Last updated: 04/07/2025, 02:18:23
class Solution {
     static {
        for(int i = 0; i < 1000; i++){
            moveZeroes(new int[] {0});
        }
    }
    public static void moveZeroes(int[] nums) {
        int j=0;

        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            nums[i] =0;
        }
    }
}