// Last updated: 04/07/2025, 02:18:14
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int highCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>highCount) highCount=count;
            }
            else{
                count=0;
            }
            
        }

        return highCount;
    }
}