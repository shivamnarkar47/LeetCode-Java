// Last updated: 04/07/2025, 02:18:27
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] ans = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j) continue;
        //         product*=nums[j];
        //     }

        //     ans[i]=product;
        // }

        // return ans;

        int prod = 1,zeroCount=0;   
        for(int num:nums){
            if(num!=0){
                prod *=num;
            }
            else{
                zeroCount++;
            }
        }

        if(zeroCount>1){
            return new int[nums.length];
        }

        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeroCount>0){
                res[i]= (nums[i]==0) ? prod:0;
            }
            else{
                res[i]=prod/nums[i];
            }
        }

        return res;
    }
}