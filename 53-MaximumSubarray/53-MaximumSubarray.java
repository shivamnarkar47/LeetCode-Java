// Last updated: 04/07/2025, 02:18:58
class Solution {
    public static int maxSubArray(int[] nums) {
        int sum=0,maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }

        return maxi;
        
    }
}