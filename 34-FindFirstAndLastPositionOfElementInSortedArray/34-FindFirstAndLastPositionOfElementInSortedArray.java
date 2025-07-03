// Last updated: 04/07/2025, 02:19:04
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        a[0]=a[1]=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                a[0]=a[1]=i;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==target){
                        a[1]=j;
                    }
                    
                }                
                break;
            }
        }

        return a;
    }
}